package com.niit.frontend.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.multipart.MultipartResolver;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages="com.niit")
public class WebConfig {
	
	@Bean
	public InternalResourceViewResolver getViewResolver()
	{
		InternalResourceViewResolver viewResolver=new InternalResourceViewResolver();
		viewResolver.setPrefix("/WEB-INF/views/");
		viewResolver.setSuffix(".jsp");
		
		return viewResolver;
			
	}
	
	@Bean(name="multipartResolver")
	public CommonsMultipartResolver getMultipartResolver()
	{
		CommonsMultipartResolver multipartResolver=new CommonsMultipartResolver();
		
		return multipartResolver;
	}
	

}
