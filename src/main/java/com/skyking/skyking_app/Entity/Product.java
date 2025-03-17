package com.skyking.skyking_app.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="product")
public class Product {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long product_id;
	//@Column(name = "prod_code")
	private Long prod_code;
	@Column(name = "prod_name")
	private String name;
	//@Column(name = "prod_quantity")
	private Long prod_quantity;
	//@Column(name = "prod_discription")
	private String prod_discription;
	//@Column(name = "prod_price")
	private Double prod_price;

	public Long getProduct_id() {
		return product_id;
	}

	public void setProduct_id(Long product_id) {
		this.product_id = product_id;
	}

	public Long getProd_code() {
		return prod_code;
	}

	public void setProd_code(Long prod_code) {
		this.prod_code = prod_code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Long getProd_quantity() {
		return prod_quantity;
	}

	public void setProd_quantity(Long prod_quantity) {
		this.prod_quantity = prod_quantity;
	}

	public String getProd_discription() {
		return prod_discription;
	}

	public void setProd_discription(String prod_discription) {
		this.prod_discription = prod_discription;
	}

	public Double getProd_price() {
		return prod_price;
	}

	public void setProd_price(Double prod_price) {
		this.prod_price = prod_price;
	}

}
