package com.ban.cloud.eureka.server.demo;

import javax.servlet.http.HttpServletRequest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication(scanBasePackages="")
@EnableEurekaServer
@RestController
public class EurekaServerApplication {
    public static void main( String[] args ){
       SpringApplication.run(EurekaServerApplication.class, args);
       System.out.println("Eureka启动成功.");
    }
    
    
    @RequestMapping(value="/sayHello",produces="application/json")
    public ModelMap sayHello(HttpServletRequest request) {
    	ModelMap resultMap = new ModelMap();
    	String toUserName = request.getParameter("toUserName");
    	resultMap.put("result", "Hi! "+ toUserName);
    	return resultMap;
    }
}
