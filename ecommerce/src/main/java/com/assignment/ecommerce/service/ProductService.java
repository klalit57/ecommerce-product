package com.assignment.ecommerce.service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.assignment.ecommerce.dao.ProductRepository;
import com.assignment.ecommerce.entity.Product;

@Service
public class ProductService {
	
	@Autowired
	private ProductRepository productRepository;
	
	
	//create
	public Product createProduct(Product product) {
		product.setProductId( UUID.randomUUID().toString().split("-")[0] );
		
		return productRepository.save(product);
		
	}
	
	//Read All
	public List<Product> getProducts(){
		return productRepository.findAll();
	}
	
	
	//Read
	public Product getProduct(String id) throws Exception {
		
		
		Optional<Product> product = productRepository.findById(id);
		
		 if(!product.isPresent()) {
			 throw new Exception("Product with given id does not exist"); 
		 }
		
		
		
		return product.get();
	}
	
	public List<Product> getProductByName(String name) throws Exception{
		
		return productRepository.findByName(name);
		
	}
	
	//update
	public Product updateProduct(String id, Product updatedProduct) throws Exception{
		Optional<Product> prevProduct = productRepository.findById(id);
		
		 if(!prevProduct.isPresent()) {
			 throw new Exception("Product with given id does not exist"); 
		 }
		 
		 prevProduct.get().setName( updatedProduct.getName()  );
		 prevProduct.get().setDescription( updatedProduct.getDescription()  );
		 prevProduct.get().setPrice( updatedProduct.getPrice()  );
		 prevProduct.get().setQuantity( updatedProduct.getQuantity()  );
		
		 return productRepository.save(prevProduct.get());
	     
	}
	
	public void deleteProduct(String id ) throws Exception {
		
		Optional<Product> product = productRepository.findById(id);
		
		 if(!product.isPresent()) {
			 throw new Exception("Product with given id does not exist"); 
		 }
		 
		 productRepository.delete(product.get());
		
	}
	
	

}
