package com.skyking.skyking_app.Entity;

import java.sql.Time;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
//@Table(name = "cust_details")
public class Customer {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id; // Unique identifier for the customer

	@Column(nullable = false)
	private String firstName; // Customer's first name

	@Column(nullable = false)
	private String lastName; // Customer's last name

	@Column(unique = true, nullable = false)
	private String phone; // Customer's phone number

	@Column(unique = true, nullable = false)
	private String email; // Customer's email address

	private String address; // Customer's address

	@Column(nullable = false)
	private String pincode; // Postal code

	@Column(nullable = false)
	private String password; // Encrypted customer password

	private boolean customerType; // Type of customer (e.g., premium or standard)

	private Time customerCreatedTime; // Timestamp for customer creation

	private Time updatedCustomerTime; // Timestamp for the last update

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPincode() {
		return pincode;
	}

	public void setPincode(String pincode) {
		this.pincode = pincode;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public boolean isCustomerType() {
		return customerType;
	}

	public void setCustomerType(boolean customerType) {
		this.customerType = customerType;
	}

	public Time getCustomerCreatedTime() {
		return customerCreatedTime;
	}

	public void setCustomerCreatedTime(Time customerCreatedTime) {
		this.customerCreatedTime = customerCreatedTime;
	}

	public Time getUpdatedCustomerTime() {
		return updatedCustomerTime;
	}

	public void setUpdatedCustomerTime(Time updatedCustomerTime) {
		this.updatedCustomerTime = updatedCustomerTime;
	}

}
