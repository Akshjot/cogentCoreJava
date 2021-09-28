package com.cogent.productmanagement;

import java.io.IOException;

import com.cogent.productmanagement.exception.InvalidProductIdException;
import com.cogent.productmanagement.exception.InvalidProductPriceException;
import com.cogent.productmanagement.model.Product;
import com.cogent.productmanagement.service.ProductService;
import com.cogent.productmanagement.service.ProductServiceImpl;

public class Main {

	public static void main(String[] args) throws InvalidProductIdException, IOException {
		// TODO Auto-generated method stub
		ProductService service = new ProductServiceImpl();
		
		String result = null;
			
		try {
			result = service.addProduct(new Product("abc", "Iphone", 100, 100));
		}
		catch(InvalidProductPriceException e)
		{
			e.printStackTrace();
		}
		
		if("success".equals(result))
		{
			System.out.println("added");
		}
		
		try
		{
			System.out.println(service.getProductById("abc").getProductName());
		}
		catch(InvalidProductIdException e)
		{
			e.printStackTrace();
		}
	}

}
