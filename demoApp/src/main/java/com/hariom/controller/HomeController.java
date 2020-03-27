package com.hariom.controller;

import java.util.List;

import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.hariom.model.Product;
import com.hariom.service.ProductService;


@Controller //this is 1st controller , tell spring to scan this controller for any new request, so add @ScanComponent
public class HomeController {
	
	@GetMapping("/")
	public String showHomePage() {
		System.out.println("In home page..");
		return "home";//this is view name --> actual this is some_path/home.jsp -> do this by view resolver -> in application properties
						//--> tell where ur views are located --> view resolver prefix and suffix add
						//--> then add webapp folder inside src/main (this is j2ee stuff)
	}
	
//	@Autowired
//	private ProductService productService;
//	
//	@GetMapping("/")
//	@Produces(MediaType.APPLICATION_JSON)
//	public List<Product> showHomePage1() {
//		System.out.println("showHomePage1..");
//		
//		return productService.getAllProduct();
//	}
	
}
