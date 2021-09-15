package br.com.hfn.integracaogoogleassitente.common.util;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class DateTimeUtil {

	public static final String DH_FRMT_HHMM = "HH:mm";
	public static final String DH_FRMT_DDMM_HHMM = "dd/MM HH:mm";
	public static final String DH_FRMT_DDMMYYY_HHMM = "dd/MM/yyyy HH:mm";
	
	public static String getDataHoraCorrenteAsString(String formato) {
		LocalDateTime currentDateTime = LocalDateTime.now(ZoneId.of("America/Sao_Paulo"));
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern(formato);
		return currentDateTime.format(formatter);
	}
	
}
