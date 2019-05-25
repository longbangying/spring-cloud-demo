package org.spring.cloud.zuul.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * Hello world!
 *
 */
@SpringBootApplication
@EnableZuulProxy
public  class ZuulApplication 
{
    public static void main( String[] args )
    {
       SpringApplication.run(ZuulApplication.class, args);
    
       System.out.println("Zuul服务启动成功.");
    }
}
