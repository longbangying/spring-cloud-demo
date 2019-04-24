package org.spring.cloud.feign.demo.controller;

import javax.servlet.http.HttpServletRequest;

import org.spring.cloud.feign.demo.service.IndexService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@RestController
@RequestMapping("/index")
public class IndexController {
	@Autowired
	private IndexService indexService;
	@RequestMapping("/info")
	@HystrixCommand(fallbackMethod="getServerInfoFallback")
	public ModelMap getServerInfo(){
		ModelMap  resultMap = indexService.getServerInfo();
		return resultMap;
	}
	
	
	public ModelMap getServerInfoFallback() {
		ModelMap  resultMap = new ModelMap();
		resultMap.put("result", "FALLBACK");
		return resultMap;
	}
}
