package org.spring.cloud.feign.demo;

import java.math.BigInteger;
import java.util.Random;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

@SpringBootApplication
@EnableDiscoveryClient
@EnableCircuitBreaker
@EnableFeignClients
public class FeignApplication {
    public static void main( String[] args ){
    	SpringApplication.run(FeignApplication.class, args);
    	System.out.println("服务调用者启动成功.");
    }
}
