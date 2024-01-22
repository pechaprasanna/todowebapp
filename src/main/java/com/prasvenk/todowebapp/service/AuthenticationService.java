package com.prasvenk.todowebapp.service;

import org.springframework.stereotype.Service;

@Service
public class AuthenticationService {
	
	public boolean authenticate(String username, String password) {
		return "Prasanna".equals(username) && "dummy123".equals(password);
	}

}
