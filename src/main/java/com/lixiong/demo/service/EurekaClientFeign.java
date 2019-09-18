package com.lixiong.demo.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

//@FeignClient(value="service-client" ,configuration = FeignConfig.class)
@FeignClient(url = "http://127.0.0.1:8083/",name="service-client")
public interface EurekaClientFeign {
	@GetMapping(value = "/hello")
	String add() ;
	
}
