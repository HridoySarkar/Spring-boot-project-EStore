package com.hridoy.estore.services;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hridoy.estore.models.product;

public interface ProductsRepository extends JpaRepository<product, Integer> {
	
}
