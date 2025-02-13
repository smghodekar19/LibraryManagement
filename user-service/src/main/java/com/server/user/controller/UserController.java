package com.server.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.server.user.config.UserConfig;

@RestController
@RequestMapping("/api/users")
public class UserController {

	@Autowired
	private UserConfig conf;
	
	@GetMapping("/port")
	public String getPortUrl() {
		return conf.getPort();
	}
	
	@GetMapping("/test")
	public String greeting() {
		return "Happy New Year";
	}
}
