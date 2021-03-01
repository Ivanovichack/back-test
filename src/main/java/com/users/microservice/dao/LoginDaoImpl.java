package com.users.microservice.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.users.microservice.dto.Login;
import com.users.microservice.exceptions.CustomException;
import com.users.microservice.interfaces.DaoInterface;
import com.users.microservice.repository.DataRepository;

@Component
public class LoginDaoImpl implements DaoInterface{
	
	@Autowired
	DataRepository repository;
	
	@Override
	public List<Login> getListLogin() throws CustomException{
		List<Login> logins = repository.getListLogin();
		return logins;
	}


}
