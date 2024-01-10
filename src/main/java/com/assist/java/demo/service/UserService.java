package com.assist.java.demo.service;

import com.assist.java.demo.entity.ApplicationUser;

public abstract class UserService {
	public abstract boolean saveUser(ApplicationUser user);
	public abstract ApplicationUser getUserByUsername(String username);	
}
