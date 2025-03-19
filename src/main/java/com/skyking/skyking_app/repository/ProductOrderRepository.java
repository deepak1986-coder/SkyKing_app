package com.skyking.skyking_app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.skyking.skyking_app.Entity.ProductOrder;

public interface ProductOrderRepository extends JpaRepository<ProductOrder, Long> {

}
