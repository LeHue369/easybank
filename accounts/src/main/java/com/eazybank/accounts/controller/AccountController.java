package com.eazybank.accounts.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountController {

	@GetMapping()
	public String sayHello(){
		return "Hello world";
	}
}
