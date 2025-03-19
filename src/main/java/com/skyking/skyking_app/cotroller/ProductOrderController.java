package com.skyking.skyking_app.cotroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.skyking.skyking_app.Entity.ProductOrder;
import com.skyking.skyking_app.service.ProductOrderService;

@RestController
@RequestMapping("/customers/orders")
public class ProductOrderController {

	@Autowired
	private ProductOrderService productOrderService;

	@PostMapping("/{customerId}")
	public List<ProductOrder> createOrders(@PathVariable Long customerId, @RequestBody List<ProductOrder> orders) {
		return productOrderService.createOrders(orders, customerId);
	}
}
