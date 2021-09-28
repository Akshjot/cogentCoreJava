package com.cogent.productmanagement.service;

import java.io.IOException;

import com.cogent.productmanagement.exception.InvalidProductIdException;
import com.cogent.productmanagement.model.Product;

public interface ProductService {
	public String addProduct(Product product);
	public String updateProduct(String productId, Product product) throws InvalidProductIdException, IOException;
	public Product getProductById(String Id) throws InvalidProductIdException, IOException;
	public Product[] getProducts();
	public String deleteProductById(String Id) throws InvalidProductIdException, IOException;
	public void deleteAllProducts();
}
