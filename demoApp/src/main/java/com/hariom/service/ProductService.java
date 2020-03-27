package com.hariom.service;

import java.util.LinkedList;
import java.util.List;

import org.springframework.stereotype.Service;
import com.hariom.model.*;
@Service
public class ProductService {
	
	public List<Product> getAllProduct() {
		
		List<Product> list = new LinkedList();
		
		list.add(new Product("product 1", 12));
		list.add(new Product("product 2", 13));
		list.add(new Product("product 3", 14));
		list.add(new Product("product 4", 15));
		
		return list;
	}
}
