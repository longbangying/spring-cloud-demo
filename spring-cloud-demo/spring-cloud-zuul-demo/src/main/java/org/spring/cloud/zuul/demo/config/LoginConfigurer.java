package org.spring.cloud.zuul.demo.config;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.spring.cloud.zuul.demo.service.face.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.authentication.encoding.PasswordEncoder;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.web.csrf.CsrfFilter;
import org.springframework.security.web.csrf.CsrfToken;
import org.springframework.security.web.csrf.CsrfTokenRepository;
import org.springframework.security.web.csrf.HttpSessionCsrfTokenRepository;
import org.springframework.web.filter.OncePerRequestFilter;

@Configuration
@EnableWebSecurity
public class LoginConfigurer extends WebSecurityConfigurerAdapter {
	
	@Autowired
	UserService userService;
	@Override
	protected void configure(HttpSecurity http) throws Exception {
	/*	http.antMatcher("/dashboard/**").authorizeRequests().anyRequest()
		.authenticated().and().csrf()
		.csrfTokenRepository(csrfTokenRepository()).and()
		.addFilterAfter(csrfHeaderFilter(), CsrfFilter.class)
		.logout().logoutUrl("/dashboard/logout").permitAll()
		.logoutSuccessUrl("/");*/
		
		http.authorizeRequests().antMatchers("/","/hello","/login2","/aouth").permitAll() //指定不需要验证的页面，其他的默认会跳转到登录页
        .anyRequest()
        .authenticated()
        .and()   
        .formLogin()  //支持表单提交
        .loginPage("/login2").permitAll()  //自定义登录页面
        .failureForwardUrl("/error")   //自定也错误
        .loginProcessingUrl("/login")  //提交action  也就是form表单中的action  login会调用security的登录不用自己实现
        .successForwardUrl("/hello")  //登录成功页面
        .and().logout()
        .permitAll();
	}
	
	
	@Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		 auth.authenticationProvider(authenticationProvider());
	}
	
	@Bean
    public AuthenticationProvider authenticationProvider() {
        DaoAuthenticationProvider provider = new DaoAuthenticationProvider();
        provider.setUserDetailsService(userService);
        //provider.setPasswordEncoder(passwordEncoder());
        provider.setHideUserNotFoundExceptions(false);
        return provider;
    }
	
	
	
	
	/*private Filter csrfHeaderFilter() {
		return new OncePerRequestFilter() {
			@Override
			protected void doFilterInternal(HttpServletRequest request,
					HttpServletResponse response, FilterChain filterChain)
					throws ServletException, IOException {
				CsrfToken csrf = (CsrfToken) request
						.getAttribute(CsrfToken.class.getName());
				if (csrf != null) {
					Cookie cookie = new Cookie("XSRF-TOKEN",
							csrf.getToken());
					cookie.setPath("/");
					response.addCookie(cookie);
				}
				filterChain.doFilter(request, response);
			}
		};
	}
	
	
	private CsrfTokenRepository csrfTokenRepository() {
		HttpSessionCsrfTokenRepository repository = new HttpSessionCsrfTokenRepository();
		repository.setHeaderName("X-XSRF-TOKEN");
		return repository;
	}*/
	
	
	
}
