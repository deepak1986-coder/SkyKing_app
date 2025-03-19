package com.skyking.skyking_app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.skyking.skyking_app.Entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long> {

}
