package org.spring.cloud.zuul.demo.service.impl;


import java.util.ArrayList;
import java.util.List;

import org.spring.cloud.zuul.demo.service.face.UserService;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
@Service
public class UserServiceImpl implements UserService {

	@Override
	public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
		 	
			List<SimpleGrantedAuthority> list = new ArrayList<>();
			System.out.println(s);
			list.add(new SimpleGrantedAuthority("ROLE_USER"));
			
			 User auth_user = new User("test", "123456", list);
		     return auth_user;
	}

}
