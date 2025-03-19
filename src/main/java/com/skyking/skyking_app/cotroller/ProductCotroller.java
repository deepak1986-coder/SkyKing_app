package com.skyking.skyking_app.cotroller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.skyking.skyking_app.Entity.Product;
import com.skyking.skyking_app.service.ProductService;

@RestController
public class ProductCotroller {

	@Autowired
	private ProductService productService;

	@RequestMapping("/api/products")
	public List<Product> getAllProduct() {
		System.out.println("Hello I am from all Product");
		System.out.println(productService.getAllProducts());
		return productService.getAllProducts();
	}

	@GetMapping("/id/{id}")
	public Product getProductById(@PathVariable Long id) {
		return productService.getProductById(id);
	}

	@GetMapping("/product/{name}")
	public ResponseEntity<?> getProductByName(@PathVariable String name) {
		Optional<Product> product = productService.getProductByNameProduct(name);
		if (product.isPresent()) {
			return ResponseEntity.ok(product.get());
		} else {
			return ResponseEntity.status(404).body("Hey Customer Product not found");
		}

		// return productService.getProductByNameProduct(name);
	}

}
