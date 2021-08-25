package com.aditya.springmvc.services;
import java.util.List;

import com.aditya.springmvc.domain.Product;

public interface ProductService {
	List<Product> listAllProducts();
	Product getProductById(Integer id);
	Product saveOrUpdateProduct(Product product);
	void deleteProduct(Integer id);
}
