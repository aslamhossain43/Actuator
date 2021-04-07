package com.actuator.main.controllers;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	@RequestMapping(value = "/{text}")
	public String say(@PathVariable String text) {
		return "You have typed " + text;
	}
}
