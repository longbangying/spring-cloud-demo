package org.spring.cloud.ribbon.demo.controller;

import org.spring.cloud.ribbon.demo.config.RibbonConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping(value="/index",produces="application/json")
public class IndexController {
	@Autowired  
	private RestTemplate restTemplate;
	@RequestMapping("/info")
	public ModelMap getServerInfo() {
		ModelMap resultMap = restTemplate.getForEntity("http://spring-cloud-eureka-client-user-provider/index/info", ModelMap.class).getBody();
		return resultMap;
	}
}
