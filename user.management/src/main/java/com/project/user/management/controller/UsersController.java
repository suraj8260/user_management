package com.project.user.management.controller;

import com.project.user.management.service.UsersService;

public class UsersController {

	UsersService service;

	public UsersController(UsersService service) {
		super();
		this.service = service;
	}
	
}
