package com.bankapp.web.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BankRestController {
	
@GetMapping(path = "home")
public String home() {
	return "hello to home";
}

@GetMapping(path = "admin")
public String homeAdmin() {
	return "hello to home admin";
}

@GetMapping(path = "mgr")
public String homeMgr() {
	return "hello to home mgr";
}

@GetMapping(path = "clerk")
public String homeuser() {
	return "hello to home clerk";
}
}
