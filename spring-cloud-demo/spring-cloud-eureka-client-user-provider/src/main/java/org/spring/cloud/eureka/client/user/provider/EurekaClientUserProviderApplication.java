package org.spring.cloud.eureka.client.user.provider;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
@MapperScan("org.spring.cloud.eureka.client.user.provider.dao.mapper")
public class EurekaClientUserProviderApplication {
    public static void main( String[] args ){
       SpringApplication.run(EurekaClientUserProviderApplication.class, args);
       System.out.println("用户服务启动成功.");
    }
}
