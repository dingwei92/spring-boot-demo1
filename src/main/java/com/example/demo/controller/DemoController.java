package com.example.demo.controller;

import com.example.demo.config.MyProps;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@ApiOperation(value = "desc of method", notes = "S",  httpMethod = "GET", response = String.class)
public class DemoController {
	@Autowired
	private MyProps myProps;
	@GetMapping("/hello")
	public String hello() {
		return "hello springboot"+myProps.getUrl();
	}
	
}
