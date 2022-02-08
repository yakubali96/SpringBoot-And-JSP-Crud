package com.example.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.model.ProductModel;

@Repository
public interface ProductRepository extends CrudRepository<ProductModel, Long>{
	
	@Query("SELECT p from ProductModel p where p.productName like %:searchText% or p.id like %:searchText%")
	public List<ProductModel> searchProduct(String searchText);

}