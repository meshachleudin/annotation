package com.niit.crudappfrontendannotation.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.niit.backend.dao.ProductDAO;
import com.niit.backend.model.Product;

@Controller
public class HomeContoller {

	@Autowired
	ProductDAO productDAO;
	
	@RequestMapping("/")
	public ModelAndView indexPage()
	{
		List<Product> listProducts=productDAO.getAllProducts();
		ModelAndView model=new ModelAndView("index");
		model.addObject("listProducts", listProducts);
	
		
		
		return model;
	}
	
	

}
