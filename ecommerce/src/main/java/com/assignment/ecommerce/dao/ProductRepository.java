package com.assignment.ecommerce.dao;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.assignment.ecommerce.entity.Product;


@Repository
public interface ProductRepository extends MongoRepository<Product,String> {

	
	List<Product> findByName(String name);
	
	

}
