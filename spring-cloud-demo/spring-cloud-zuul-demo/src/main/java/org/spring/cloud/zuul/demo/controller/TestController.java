package org.spring.cloud.zuul.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("test")
public class TestController {
	@RequestMapping("test")
	public String test() {
		return "api";
	}

}
