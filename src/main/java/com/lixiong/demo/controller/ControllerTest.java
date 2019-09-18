package com.lixiong.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lixiong.demo.service.EurekaClientFeign;

import io.swagger.annotations.Api;

@RestController
@Api(value = "新产品")
public class ControllerTest {
	@Autowired
	EurekaClientFeign eurekaClientFeign;
	@GetMapping(value = "add1")
	public String add1() {
		return eurekaClientFeign.add();
	}
	@GetMapping(value ="/add2")
	public String add2() {
		return eurekaClientFeign.add();
	}
}
