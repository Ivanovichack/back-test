package com.users.microservice.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.stereotype.Component;

@Component
public class TimeDate {
	
	public String calcTime(String date) {
		String time = "";
		SimpleDateFormat d = new SimpleDateFormat("yyyy-MM-dd");
		try {
			Date fechaInicio = d.parse(date);
			Date fechaActual = new Date(System.currentTimeMillis());
			int milisByDay = 86400000;
			int dias = (int) ((fechaActual.getTime()- fechaInicio.getTime()) / milisByDay);
			time = dias + " día(s)";
		} catch (ParseException e) {
			
			e.printStackTrace();
		}
		return time;
	}
}
