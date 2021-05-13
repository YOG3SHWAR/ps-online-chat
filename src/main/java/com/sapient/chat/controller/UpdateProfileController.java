package com.sapient.chat.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class UpdateProfileController {

	@GetMapping("/healthy")
	public String health() {
		return "Update Profile Controller";
	}
}
