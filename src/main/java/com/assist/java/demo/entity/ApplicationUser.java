package com.assist.java.demo.entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @NoArgsConstructor @AllArgsConstructor
@Document(collection = "users")
public class ApplicationUser {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private String username;
	private String password;
	private Role role;
}
