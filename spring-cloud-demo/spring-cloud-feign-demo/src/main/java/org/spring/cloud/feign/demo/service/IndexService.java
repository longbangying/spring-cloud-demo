package org.spring.cloud.feign.demo.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient("spring-cloud-eureka-client-user-provider")
public interface IndexService {
	@RequestMapping("/index/info")
	ModelMap getServerInfo();
}
