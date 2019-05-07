package org.spring.cloud.eureka.client.user.provider.service.impl;

import org.spring.cloud.eureka.client.user.provider.dao.mapper.BaseMapper;
import org.spring.cloud.eureka.client.user.provider.dao.mapper.TUserMapper;
import org.spring.cloud.eureka.client.user.provider.dao.model.TUser;
import org.spring.cloud.eureka.client.user.provider.dao.model.TUserExample;
import org.spring.cloud.eureka.client.user.provider.service.face.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class UserServiceImpl extends BaseServiceImpl<TUser, TUserExample, Long> implements UserService {
	@Autowired
	TUserMapper tUserMapper;

	@Override
	public BaseMapper<TUser, TUserExample, Long> getMapper() {
		return tUserMapper;
	}
	
	
	

}
