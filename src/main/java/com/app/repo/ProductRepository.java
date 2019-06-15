package com.app.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.model.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {

	<T> List<T> findByProdCost(Double prodCost,Class<T> cls);
	
	interface MyData
	{
		String getProdCode();
		Integer getProdId();
		
	}
	interface MyView
	{
		String getProdCode();
		Double getProdCost();
	}
	
	
}
