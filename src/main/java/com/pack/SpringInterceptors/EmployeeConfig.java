package com.pack.SpringInterceptors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class EmployeeConfig implements WebMvcConfigurer{
	
	@Autowired
	TimerInterceptor timerInterceptor;
	
	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		//registry.addInterceptor(timerInterceptor); // This intercepter for all controller programs
		registry.addInterceptor(timerInterceptor).addPathPatterns("/emp");
	}

}
