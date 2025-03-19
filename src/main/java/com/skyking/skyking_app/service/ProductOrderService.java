package com.skyking.skyking_app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.skyking.skyking_app.Entity.Customer;
import com.skyking.skyking_app.Entity.ProductOrder;
import com.skyking.skyking_app.repository.CustomerRepository;
import com.skyking.skyking_app.repository.ProductOrderRepository;

import jakarta.transaction.Transactional;

@Service
public class ProductOrderService {

	@Autowired
	private ProductOrderRepository productOrderRepository;
	@Autowired
	private CustomerRepository customerRepository;

	@Transactional
	public List<ProductOrder> createOrders(List<ProductOrder> orders, Long customerId) {
		Customer customer = customerRepository.findById(customerId)
				.orElseThrow(() -> new RuntimeException("Customer not found!"));

		orders.forEach(order -> order.setCustomer(customer));
		return productOrderRepository.saveAll(orders);
	}

}
