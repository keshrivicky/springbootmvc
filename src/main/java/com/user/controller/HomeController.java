package com.user.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class HomeController {

	@GetMapping("/")
	public String homepage(Model model) {
		return "home";
	}
	
	
	@GetMapping("/user_data")
	public String homepage1(Model model) {
		return "user";
	}
}
