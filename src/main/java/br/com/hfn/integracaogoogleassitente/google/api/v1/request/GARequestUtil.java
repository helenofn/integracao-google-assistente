package br.com.hfn.integracaogoogleassitente.google.api.v1.request;

public class GARequestUtil {

	public static String getHandle(GARequest gaRequest) {
		if(null!=gaRequest && null != gaRequest.getHandler()) {
			return gaRequest.getHandler().getName();
		}
		return null;
	}
}
