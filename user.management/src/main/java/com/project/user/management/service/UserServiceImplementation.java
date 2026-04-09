package com.project.user.management.service;

import com.project.user.management.repository.UsersRepository;

public class UserServiceImplementation implements UsersService {

	UsersRepository repo;

	public UserServiceImplementation(UsersRepository repo) {
		super();
		this.repo = repo;
	}
	
	
}
