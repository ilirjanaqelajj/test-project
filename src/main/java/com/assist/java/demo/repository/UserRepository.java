package com.assist.java.demo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.assist.java.demo.entity.ApplicationUser;

public interface UserRepository extends MongoRepository<ApplicationUser, String>{
	boolean saveUser(ApplicationUser user);
	ApplicationUser getUserByUsername(String username);

}
