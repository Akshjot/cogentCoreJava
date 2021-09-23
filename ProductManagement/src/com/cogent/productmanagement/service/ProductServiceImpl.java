package com.cogent.productmanagement.service;

import com.cogent.productmanagement.model.Product;
import com.cogent.productmanagement.repository.ProductRepository;
import com.cogent.productmanagement.repository.ProductRepositoryImpl;

public class ProductServiceImpl implements ProductService {
	
	ProductRepository productRepository = ProductRepositoryImpl.getInstance();
	
	private static ProductService productService;
	
	public static ProductService getInstance()
	{
		if(productService==null)
		{
			productService = new ProductServiceImpl();
			return productService;
		}
		return productService;
	}
	
	
	
	@Override
	public String addProduct(Product product) {
		// TODO Auto-generated method stub
		return productRepository.addProduct(product);
	}

	@Override
	public String updateProduct(String productId, Product product) {
		// TODO Auto-generated method stub
		return productRepository.updateProduct(productId, product);
	}

	@Override
	public Product getProductById(String Id) {
		// TODO Auto-generated method stub
		return productRepository.getProductById(Id);
	}

	@Override
	public Product[] getProducts() {
		// TODO Auto-generated method stub
		return productRepository.getProducts();
	}

	@Override
	public String deleteProductById(String Id) {
		// TODO Auto-generated method stub
		return productRepository.deleteProductById(Id);
	}

	@Override
	public void deleteAllProducts() {
		// TODO Auto-generated method stub
		productRepository.deleteAllProducts();
	}

}
