package com.niit.backend.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.web.multipart.MultipartFile;

@Entity
@Table(name="Product")
public class Product{
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	@NotEmpty
	@Size(min=2,max=10,message="Name has to be between 2 to 10 characters")
	/*@NotEmpty(message="Name field can't be empty")*/
	private String Productname;
	@NotEmpty(message="brand field can't be empty")
	private String brand;
	@NotEmpty(message="price field can't be empty")
	private int price;
	
	@Transient
	private MultipartFile image;
	
	public Product() {
		super();
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getProductname() {
		return Productname;
	}
	public void setProductname(String productname) {
		this.Productname = productname;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public MultipartFile getImage() {
		return image;
	}
	public void setImage(MultipartFile image) {
		this.image = image;
	}
	
}
	