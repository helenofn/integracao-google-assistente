package br.com.hfn.integracaogoogleassitente.common.security.provider;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.net.HttpURLConnection;
import java.net.URL;
import java.security.Key;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.RSAPublicKeySpec;
import java.util.Base64;
import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import br.com.hfn.integracaogoogleassitente.common.util.StringUtil;
import br.com.hfn.integracaogoogleassitente.google.api.v1.dto.GAUserIdTokenDTO;
import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jws;
import io.jsonwebtoken.JwsHeader;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SigningKeyResolver;
import io.jsonwebtoken.SigningKeyResolverAdapter;
import lombok.extern.log4j.Log4j2;

@Component
@Log4j2
public class JwtTokenProvider {

	private static final String URL_GOOGLE_API_OAUTH2_CERTS = "";
	//private String projectId = "";
	
	@Value("${google.actions.project.iss:https://accounts.google.com}")
	private String projectIss = "";
	@Value("${google.actions.project.iss:https://accounts.google.com}")
	private String projectAud = "859623945114-ef03e7g7i6c668j2044aluv4hjigemkb.apps.googleusercontent.com";
	
	
	public GAUserIdTokenDTO getGAUserFromToken(HttpServletRequest request) {
		String token = resolveToken(request);
		Claims claims = getJwtBody(token);
		GAUserIdTokenDTO user = GAUserIdTokenDTO.builder()
				.email(claims.get("email", String.class))
				.isEmailVerified(claims.get("email_verified", Boolean.class).booleanValue())
				.nomeCompleto(claims.get("name", String.class))
				.primeiroNome(claims.get("given_name", String.class))
				.sobrenome(claims.get("family_name", String.class))
				.aud(claims.get("aud", String.class))
				.exp(claims.get("exp", Date.class))
				.iat(claims.get("iat", Date.class))
				.iss(claims.get("iss", String.class))
				.jti(claims.get("jti", String.class))
				.sub(claims.get("sub", String.class))
				.build();
		isValidToken(user);
		return user;
	}
	
	private String resolveToken(HttpServletRequest request) {
		if(null!=request) {
			String strToken = request.getHeader("authorization");
			System.out.println("##################### Token:");
			System.out.println(strToken);
			if(!StringUtil.isEmpty(strToken)) {
				return strToken;
			}
		}
		return null;
	}
	
	private HttpURLConnection getConnection(String urlStr) {
		try {
			URL url = new URL(urlStr);
			HttpURLConnection connection = (HttpURLConnection) url.openConnection();
			connection.setRequestMethod("GET");
			return connection; 
		}catch(IOException ie) {
			log.error("Erro ao obter a chave publica da google.", ie.getMessage(), ie);
			throw new RuntimeException("Erro ao obter a chave publica da google.", ie);
		}
	}
	
	private String simpleGet(String urlStr) {
		HttpURLConnection connection = getConnection(urlStr);
		try (BufferedReader rd = new BufferedReader(new InputStreamReader(connection.getInputStream()))){
			
			StringBuilder response = new StringBuilder();
			String line;
			while((line = rd.readLine())!=null) {
				response.append(line);
				response.append("\r");
			}
			return response.toString();
		}catch(Exception e) {
			log.error("Erro ao obter a chave publica da google.", e.getMessage(), e);
			throw new RuntimeException("Erro ao obter a chave publica da google.", e);
		}finally {
			if(connection!=null) {
				connection.disconnect();
			}
		}
	}
		
	@SuppressWarnings("unchecked")
	private Map<String, String> getKeyById(Map<String, Object> jwks, String kid){
		List<Map<String, String>> keys = (List<Map<String, String>>)jwks.get("keys");
		Map<String, String> ret = null;
		for(int i = 0; i < keys.size(); i++) {
			if(keys.get(i).get("kid").equals(kid)) {
				return keys.get(i);
			}
		}
		return ret;
	}
	
	private Claims getJwtBody(String token) {
		
		TypeReference<Map<String, Object>> typeRef = new TypeReference<Map<String, Object>>(){};
		ObjectMapper mapper = new ObjectMapper();
		try {
			Map<String, Object> jwks = mapper.readValue(simpleGet(URL_GOOGLE_API_OAUTH2_CERTS), typeRef);
			SigningKeyResolver resolver = new SigningKeyResolverAdapter() {
				public Key resolveSigningKey(@SuppressWarnings("rawtypes") JwsHeader jwsHeader, Claims claims) {
					try {
						Map<String, String> jwk = getKeyById(jwks, jwsHeader.getKeyId());
						if(null!=jwk) {
							BigInteger modulus = new BigInteger(1, Base64.getUrlDecoder().decode(jwk.get("n")));
							BigInteger exponent = new BigInteger(1, Base64.getUrlDecoder().decode(jwk.get("e")));
							return KeyFactory.getInstance("RSA").generatePublic(new RSAPublicKeySpec(modulus, exponent));
						}
						throw new RuntimeException("Erro ao resolver a chave publica. (jwk is null)");
					}catch(NoSuchAlgorithmException | InvalidKeySpecException e) {
						log.error("Erro ao resolver a chave publica.", e.getMessage(), e);
						throw new RuntimeException("Erro ao resolver a chave publica.", e);
					}
				}
			};
			
			Jws<Claims> jwsClaims = Jwts.parser()
					.setSigningKeyResolver(resolver)
					.parseClaimsJws(token);
			
			return jwsClaims.getBody();
			
		}catch(Exception e) {
			log.error("Erro ao converter o token.", e.getMessage(), e);
			throw new RuntimeException("Erro ao converter o token.", e);
		}
	}
	
	private boolean isValidToken(GAUserIdTokenDTO user) {
		if(!projectAud.equalsIgnoreCase(user.getAud())) {
			log.error("aud divergente.");
			throw new RuntimeException("aud divergente.");
		}else if(projectIss.equalsIgnoreCase(user.getIss())) {
			log.error("iss divergente.");
			throw new RuntimeException("iss divergente.");
		}
		return true;
	}
	
}
