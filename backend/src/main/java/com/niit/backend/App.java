package com.niit.backend;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.niit.backend.config.AppContextConfig;
import com.niit.backend.dao.ProductDAO;
import com.niit.backend.model.Product;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       AbstractApplicationContext context=new AnnotationConfigApplicationContext(AppContextConfig.class);
       
 ProductDAO productDAO=(ProductDAO)context.getBean("productDAO");
       
       Product product=new Product();
       product.setProductId(11);
       product.setProductName("India");
       product.setCategory("category");
       product.setPrice(35000.00);
       

       
       
    }
}