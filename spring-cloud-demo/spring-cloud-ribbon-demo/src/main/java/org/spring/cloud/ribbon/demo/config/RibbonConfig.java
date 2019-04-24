package org.spring.cloud.ribbon.demo.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class RibbonConfig {
	 	@Bean  
	    @LoadBalanced  
	    public RestTemplate restTemplate() { // equals to RestTemplate  
	        return new RestTemplate();  
	    }  
}
