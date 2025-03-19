package com.skyking.skyking_app.Entity;

import java.sql.Time;

import com.skyking.skyking_app.Entity.Customer;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "product_order")
public class ProductOrder {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long customerOrderId;
	private Long productCode;
	private String productName;
	private Long productQuantity;
	private Double productPrice;
	private Double totalPrice;
	private Time orderCreatedDate;
	private Time orderUpdateDate;
	@ManyToOne
	@JoinColumn(name = "id", nullable = false)
	private Customer customer;

	public Long getCustomerOrderId() {
		return customerOrderId;
	}

	public void setCustomerOrderId(Long customerOrderId) {
		this.customerOrderId = customerOrderId;
	}

	public Long getProductCode() {
		return productCode;
	}

	public void setProductCode(Long productCode) {
		this.productCode = productCode;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public Long getProductQuantity() {
		return productQuantity;
	}

	public void setProductQuantity(Long productQuantity) {
		this.productQuantity = productQuantity;
	}

	public Double getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(Double productPrice) {
		this.productPrice = productPrice;
	}

	public Double getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(Double totalPrice) {
		this.totalPrice = totalPrice;
	}

	public Time getOrderCreatedDate() {
		return orderCreatedDate;
	}

	public void setOrderCreatedDate(Time orderCreatedDate) {
		this.orderCreatedDate = orderCreatedDate;
	}

	public Time getOrderUpdateDate() {
		return orderUpdateDate;
	}

	public void setOrderUpdateDate(Time orderUpdateDate) {
		this.orderUpdateDate = orderUpdateDate;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

}
