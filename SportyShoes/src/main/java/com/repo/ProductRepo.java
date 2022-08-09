package com.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.model.Product;

public interface ProductRepo extends JpaRepository<Product, Long> {
	Product findById(long id);
}