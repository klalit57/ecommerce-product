package com.assignment.ecommerce.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.assignment.ecommerce.entity.Product;
import com.assignment.ecommerce.service.ProductService;


@RestController
@RequestMapping("/products")
public class ProductController {

	@Autowired
	private ProductService productService;
	
	@PostMapping
	public Product createProduct(@RequestBody Product product) {
		
		return productService.createProduct(product);
	
	}
	
	
	@GetMapping
	public List<Product> getProducts(){
		return productService.getProducts();
	}
	
	//get a single product with product id
	@GetMapping("/productId/{productId}")
	public Product getProduct(@PathVariable  String productId) throws Exception {
		return productService.getProduct(productId);
	}
	
	//getting a List of product with same same name
	@GetMapping("/name/{name}")
	public List<Product> getProductByName(@PathVariable  String name) throws Exception {
		return productService.getProductByName(name);
	}
	
	//updating a product with product id
	@PutMapping("/productId/{productId}")
	public Product updateProduct(@PathVariable String productId, @RequestBody Product updatedProduct) throws Exception{
		
		 return productService.updateProduct(productId,updatedProduct);
	     
	}
	
	//deleting a product with product id
	@DeleteMapping("/productId/{productId}")
	public List<Product> deleteProduct( @PathVariable String productId) throws Exception {
		
		productService.deleteProduct(productId);
		
		return productService.getProducts();
	}
	
	
}
