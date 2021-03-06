package br.com.hfn.integracaogoogleassitente.hook.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.hfn.integracaogoogleassitente.common.security.provider.JwtTokenProvider;
import br.com.hfn.integracaogoogleassitente.common.util.DateTimeUtil;
import br.com.hfn.integracaogoogleassitente.google.api.v1.NextScene;
import br.com.hfn.integracaogoogleassitente.google.api.v1.Prompt;
import br.com.hfn.integracaogoogleassitente.google.api.v1.Scene;
import br.com.hfn.integracaogoogleassitente.google.api.v1.Simple;
import br.com.hfn.integracaogoogleassitente.google.api.v1.dto.GAUserIdTokenDTO;
import br.com.hfn.integracaogoogleassitente.google.api.v1.request.GARequest;
import br.com.hfn.integracaogoogleassitente.google.api.v1.request.GARequestUtil;
import br.com.hfn.integracaogoogleassitente.google.api.v1.response.GAResponse;
import br.com.hfn.integracaogoogleassitente.google.api.v1.response.GAResponseUtil;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@RestController
@RequestMapping("/v1/hook/api")
public class HookController {

	private final JwtTokenProvider jwtTokenProvider; 
	
	@PostMapping(path = "/", consumes = MediaType.APPLICATION_JSON_VALUE)
	public GAResponse processar(HttpServletRequest request, @RequestBody GARequest gaRequest) {
		
		GAUserIdTokenDTO user =  jwtTokenProvider.getGAUserFromToken(request);
		
		String handler =  GARequestUtil.getHandle(gaRequest);
		if("perguntarMarcacaoPonto".equalsIgnoreCase(handler)) {
			return perguntarMarcacaoPonto(user, gaRequest);
		}else if("marcarPontoEntrada".equalsIgnoreCase(handler)) {
			return marcarPonto(user, true, gaRequest);
		}else if("marcarPontoSaida".equalsIgnoreCase(handler)) {
			return marcarPonto(user, false, gaRequest);
		}
		
		GAResponse response = GAResponseUtil.createResponse(gaRequest);
		response.setScene(new Scene(null, new NextScene("ErroFatal"),null,null));
		return response;
	}
	
	private GAResponse perguntarMarcacaoPonto(GAUserIdTokenDTO user, GARequest gaRequest) {
		
		String horaAtual = DateTimeUtil.getDataHoraCorrenteAsString(DateTimeUtil.DH_FRMT_HHMM);
		
		StringBuilder msg = new StringBuilder();
		msg.append(user.getPrimeiroNome());
		msg.append(", encontramos o seu cadastro. S??o ");
		msg.append(horaAtual);
		msg.append(", o que gostaria de fazer, marcar o ponto de entrada ou sa??da?");
		
		GAResponse response = GAResponseUtil.createResponse(gaRequest);
		Prompt prompt = new Prompt();
		prompt.setFirstSimple(new Simple(msg.toString(),null));
		prompt.setOverride(false);
		response.setPrompt(prompt);
		response.setScene(new Scene(null, new NextScene("MarcarPonto"),null,null));
		return response;
	}
	
	private GAResponse marcarPonto(GAUserIdTokenDTO user, boolean isEntrada, GARequest gaRequest) {
		
		String horaAtual = DateTimeUtil.getDataHoraCorrenteAsString(DateTimeUtil.DH_FRMT_HHMM);
		
		StringBuilder msg = new StringBuilder();
		msg.append(user.getPrimeiroNome());
		msg.append(", a marca????o foi realizada com sucesso para as ");
		msg.append(horaAtual);
		msg.append(".");
		
		GAResponse response = GAResponseUtil.createResponse(gaRequest);
		Prompt prompt = new Prompt();
		prompt.setFirstSimple(new Simple(msg.toString(),null));
		prompt.setOverride(false);
		response.setPrompt(prompt);
		response.setScene(new Scene(null, new NextScene("EncerrarApp"),null,null));
		
		return response;
	}

}
