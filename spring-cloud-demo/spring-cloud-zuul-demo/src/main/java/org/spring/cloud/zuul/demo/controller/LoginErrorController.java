package org.spring.cloud.zuul.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginErrorController {
	@RequestMapping("/dashboard/login")
	public String dashboard() {
		return "redirect:/#/";
	}
}
