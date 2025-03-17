package com.skyking.skyking_app.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.skyking.skyking_app.Entity.Product;
import com.skyking.skyking_app.repository.ProductRepository;

@Service
public class ProductService {

	@Autowired
	private ProductRepository productRepository;

	public List<Product> getAllProducts() {
		return productRepository.findAll();
	}

	public Product getProductById(Long id) {
		return productRepository.findById(id).orElse(null);
	}

	public Optional<Product> getProductByNameProduct(String name) {
		return productRepository.findByName(name);
	}

}
