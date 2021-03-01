package com.users.microservice.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.users.microservice.dao.LoginDaoImpl;
import com.users.microservice.dto.Login;
import com.users.microservice.exceptions.CustomException;
import com.users.microservice.interfaces.ServiceInterface;
import com.users.microservice.util.TimeDate;

@Service
public class LoginServiceImpl implements ServiceInterface{
	
	@Autowired
	LoginDaoImpl loginDao;
	
	@Autowired
	TimeDate timeDate;
	
	@Override
	public List<Login> getListLogin() throws CustomException {
		List<Login> logins = loginDao.getListLogin();

		if(!logins.isEmpty()) {
			for (Login login : logins) {
				login.setTime_days(timeDate.calcTime(login.getDate_login()));
			}
		}else {
			throw new CustomException("No se encontraron datos");
		}
		return logins;
	}

	

	

}
