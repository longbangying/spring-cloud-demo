package org.spring.cloud.eureka.client.user.provider.controller;

import java.util.Date;

import javax.servlet.http.HttpServletRequest;

import org.spring.cloud.eureka.client.user.provider.dao.mapper.TUserInfoMapper;
import org.spring.cloud.eureka.client.user.provider.dao.model.TUserInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/index")
public class IndexController {
	@Autowired
	private TUserInfoMapper TUserInfoMapper;
	
	@RequestMapping(value="/info",produces="application/json")
	public ModelMap getServerInfo(HttpServletRequest request){
		System.out.println(request.getLocalPort());
		ModelMap  resultMap = new ModelMap();
		resultMap.put("SERVER-NAME","spring-cloud-eureka-client-user-provider"+ request.getLocalPort());
		return resultMap;
	}
	
	@RequestMapping(value="/test",produces="application/json")
	public ModelMap test() {
		ModelMap  resultMap = new ModelMap();
		TUserInfo  info = new TUserInfo();
		info.setCreateTime(new Date());
		info.setLoginName("longbangying");
		info.setPwd("1232323");
		info.setSalt("23324343");
		info.setUserName("longbangying");
		TUserInfoMapper.insertSelective(info);
		resultMap.put("data", info);
		throw new RuntimeException("1222222");
		//return resultMap;
	}
	
}
