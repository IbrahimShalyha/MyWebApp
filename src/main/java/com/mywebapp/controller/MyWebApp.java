package com.mywebapp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyWebApp {

	@GetMapping(value = "/getMy")
	public String getMy() {
		return "SORRY FOR ALL THE THINGS I DID";
	}
}
