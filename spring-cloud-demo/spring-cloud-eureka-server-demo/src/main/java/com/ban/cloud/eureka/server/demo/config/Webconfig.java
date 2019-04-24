package com.ban.cloud.eureka.server.demo.config;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.convert.converter.Converter;

@Configuration
public class Webconfig {
	 @Bean
	    public Converter<String, Date> addNewConvert() {
	        return new Converter<String, Date>() {
	            @Override
	            public Date convert(String source) {
	                SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS");
	                 Date date = null;
	            try {
	                date = sdf.parse((String) source);
	                } catch (Exception e) {
	                e.printStackTrace();
	                }
	             return date;
	            }
	        };
	    }
}
