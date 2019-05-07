package org.spring.cloud.zuul.demo.zuulfilter;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.stereotype.Component;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
@Component
public class RoutingZuulFilter extends ZuulFilter {

	@Override
	public Object run() {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:SSS");
		RequestContext context = RequestContext.getCurrentContext();
		System.out.println("请求进来了,转发时 " + sdf.format(new Date()));
		
		
		return null;
	}

	@Override
	public boolean shouldFilter() {
		return true;
	}

	@Override
	public int filterOrder() {
		return 0;
	}

	@Override
	public String filterType() {
		
		return "routing";
	}

}
