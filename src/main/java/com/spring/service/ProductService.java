package com.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.model.Product;
import com.spring.repo.ProductRepository;

@Service
public class ProductService {

	@Autowired
	private ProductRepository productrepository;
	
	public Product addProduct(Product p) {
		return productrepository.save(p);
	}
	public Product updateProduct(Product p) {
		return productrepository.save(p);
	}
	public Product getProduct(Integer id) {
		return productrepository.findById(id).orElseThrow(null);
		}
	public void del(Integer id) {
		productrepository.deleteById(id);
	}
	public List<Product>getProduct(){
		return productrepository.findAll();
	}
}
