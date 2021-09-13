package br.com.hfn.integracaogoogleassitente.common.util;

public class StringUtil {

	private StringUtil() {
		throw new IllegalStateException("Classe de utilidades");
	}
	
	public static boolean isEmpty(String str) {
		return null==str || "".equalsIgnoreCase(str) || str.length()==0;
	}
}
