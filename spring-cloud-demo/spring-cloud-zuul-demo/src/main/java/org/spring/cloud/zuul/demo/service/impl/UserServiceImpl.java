package org.spring.cloud.zuul.demo.service.impl;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.spring.cloud.zuul.demo.service.face.UserService;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
@Service
public class UserServiceImpl implements UserService {

	/*@Override
	public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
		 	
			List<SimpleGrantedAuthority> list = new ArrayList<>();
			System.out.println(s);
			list.add(new SimpleGrantedAuthority("ROLE_USER"));
			
			 User auth_user = new User("test", "123456", list);
		     return auth_user;
	}
*/
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		/*User user = userDao.findByUsername(username);
		if(user == null){
			throw new UsernameNotFoundException("Invalid username or password.");
		}*/
		if(StringUtils.isBlank(username) || !"admin".equals(username)) {
			throw new UsernameNotFoundException("Invalid username or password.");
		}
		
		
		return new org.springframework.security.core.userdetails.User(username, "123456", getAuthority());
	}
	
	
	private List getAuthority() {
		return Arrays.asList(new SimpleGrantedAuthority("ROLE_ADMIN"));
	}
}
