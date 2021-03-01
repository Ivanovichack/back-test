package com.users.microservice.controllers;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.users.microservice.dto.Login;
import com.users.microservice.exceptions.CustomException;
import com.users.microservice.services.LoginServiceImpl;


@RestController
@CrossOrigin("*")
@RequestMapping("/user")
public class LoginsController {
	
	@Autowired
	LoginServiceImpl loginService;
	
	@GetMapping("/login")
	public ResponseEntity<Object> getListLogin() throws CustomException{
		List<Login> logins = loginService.getListLogin();
		
		return new ResponseEntity<>(logins, new HttpHeaders(), HttpStatus.OK);
	}
}
