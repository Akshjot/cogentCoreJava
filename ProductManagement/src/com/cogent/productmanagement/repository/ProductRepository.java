package com.cogent.productmanagement.repository;

import com.cogent.productmanagement.model.Product;

public interface ProductRepository {
	public String addProduct(Product product);
	public String updateProduct(String productId, Product product);
	public Product getProductById(String Id);
	public Product[] getProducts();
	public String deleteProductById(String Id);
	public void deleteAllProducts();
}
