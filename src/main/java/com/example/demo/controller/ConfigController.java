package com.example.demo.controller;

import java.util.HashMap;
import java.util.Map;

import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.User;

@RestController
public class ConfigController {

	@Value("${server.port:8080}")
	private String port;
	
	@Autowired
	private Environment env;
	
	@Autowired
	private User user;
	
	@GetMapping("/config")
	@ApiOperation(value = "desc of method",  httpMethod = "GET", response = String.class,notes = "S")
	public Object config() {
		Map<String, Object> result = new HashMap<>();
		result.put("port", port);
		result.put("profile", env.getProperty("spring.profiles.active"));
		result.put("user", user.getName());
		return result;
	}
	
}
