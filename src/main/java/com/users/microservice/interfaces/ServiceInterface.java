package com.users.microservice.interfaces;

import java.util.List;

import com.users.microservice.dto.Login;
import com.users.microservice.exceptions.CustomException;

public interface ServiceInterface {
	public List<Login> getListLogin() throws CustomException;

}
