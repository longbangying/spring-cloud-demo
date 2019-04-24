package org.spring.cloud.ribbon.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class RibbonApplication {
    public static void main( String[] args ){
    	SpringApplication.run(RibbonApplication.class, args);
    	System.out.println("RIBBON 启动成功.");
    }
}
