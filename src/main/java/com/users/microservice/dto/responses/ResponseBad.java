package com.users.microservice.dto.responses;

import java.util.ArrayList;
import java.util.List;

public class ResponseBad {
	List<String> details;
	String message;	
	
	public ResponseBad() {
		details = new ArrayList<String>();
	}

	public List<String> getDetails() {
		return details;
	}

	public void setDetails(List<String> details) {
		this.details = details;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	public void addDetail(String detail) {
		this.details.add(detail);
	}
	
	

	
}
