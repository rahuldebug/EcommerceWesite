package com.ecom.users.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

//richardson maturity model and single responsibility priniciple will be used SOLID)

@RestController("/users")
public class UserController {
	//paganation needs to be implemented 
	@GetMapping("/get")
	public void getAllUsers() {
		
	}

}
