package com.niit.backend.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Transactional;

import com.niit.backend.model.Product;

@Repository("productDAO")
@EnableTransactionManagement
@Transactional
public class ProductDAOImpl implements ProductDAO{

	@Autowired
	SessionFactory sessionFactory;

	public void addProduct(Product product) {
		Session session=sessionFactory.getCurrentSession();
		session.persist(product);
		
	}

	public void updateProduct(Product product) {
		Session session=sessionFactory.getCurrentSession();
		session.update(product);
		
	}

	public List<Product> listProducts() {
		Session session=sessionFactory.getCurrentSession();
		List<Product> products=session.createQuery("from Product").getResultList();
		return products;
	}

	public Product getProductById(int id) {
		Session session=sessionFactory.getCurrentSession();
	    Product product=(Product)session.createQuery("from Product where id="+id).getSingleResult();
		return product;
	}

	public void removeProduct(int id) {
		Session session=sessionFactory.getCurrentSession();
		Product product=(Product)session.createQuery("from Product where id="+id).getSingleResult();
		session.delete(product);
		
	}
}
