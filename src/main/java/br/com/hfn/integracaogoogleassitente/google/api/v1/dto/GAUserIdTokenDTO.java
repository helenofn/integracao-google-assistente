package br.com.hfn.integracaogoogleassitente.google.api.v1.dto;

import java.util.Date;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class GAUserIdTokenDTO {

	private String email;
	private String nomeCompleto;
	private String primeiroNome;
	private String sobrenome;
	private boolean isEmailVerified;
	
	private String iss;
	private String aud;
	private String sub;
	private Date iat;
	private Date exp;
	private String jti;
	
}
