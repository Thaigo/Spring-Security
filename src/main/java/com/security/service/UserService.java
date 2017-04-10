package com.security.service;

import com.security.model.User;

public interface UserService {
	
	public User findByEmail(String email);

}
