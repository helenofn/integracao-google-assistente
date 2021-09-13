package br.com.hfn.integracaogoogleassitente.google.api.v1.response;

import br.com.hfn.integracaogoogleassitente.google.api.v1.Expected;
import br.com.hfn.integracaogoogleassitente.google.api.v1.Scene;
import br.com.hfn.integracaogoogleassitente.google.api.v1.request.GARequest;

public class GAResponseUtil {

	public static GAResponse createResponse(GARequest request) {
		if(null!=request) {
			return new GAResponse(
					null,
					new Scene(null,null,null,null),
					request.getSession(),
					request.getUser(),
					request.getHome(),
					request.getDevice(),
					new Expected(null)
					);
		}else {
			return new GAResponse(
					null,
					new Scene(null,null,null,null),
					null,
					null,
					null,
					null,
					new Expected(null)
					);
		}
	}
}
