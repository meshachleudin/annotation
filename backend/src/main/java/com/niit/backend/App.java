package com.niit.backend;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.niit.backend.config.AppContextConfig;
import com.niit.backend.dao.ProductDAO;

/**
 * Hello world!
 *
 */
public class App 
{
	 public static void main( String[] args )
	    {
	        AbstractApplicationContext context=new AnnotationConfigApplicationContext(AppContextConfig.class);
	        
	       
	    }
}