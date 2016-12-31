package com.niit.frontend.config;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter{
	
	@Autowired
	DataSource dataSource;
	
	@Autowired
	public void configureGlobalSecurity(AuthenticationManagerBuilder auth) throws Exception {
		auth.inMemoryAuthentication().withUser("meshach").password("password@123").roles("USER")
		.and().withUser("admin").password("password").roles("ADMIN");
		
		auth.jdbcAuthentication().dataSource(dataSource)
		.usersByUsernameQuery("select username,password,enabled from user where username=?")
		.authoritiesByUsernameQuery("select username,role from user where username=?");

		
		
	}
	
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.authorizeRequests()
		.antMatchers("/","/home").permitAll()
		.antMatchers("/admin/**").access("hasRole('ADMIN')")
		.and().formLogin()
		.and().exceptionHandling().accessDeniedPage("/Access_Denied");
		
	}
	
}
	