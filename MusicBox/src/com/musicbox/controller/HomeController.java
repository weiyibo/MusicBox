package com.musicbox.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.musicbox.dao.ProductDao;
import com.musicbox.model.Product;


@Controller
public class HomeController {
	
	private ProductDao productDao = new ProductDao();
	@RequestMapping("/")
	public String home(){
		return "index";
	}
	
	@RequestMapping(value="/productList", method=RequestMethod.POST,headers="Accept=application/json")
	public @ResponseBody List<Product> productList(){
		System.out.println("productList");
		
		List<Product> products = productDao.getProductList();
		
		
		
		return products;
	}
	
	@RequestMapping("/productDetail")
	public @ResponseBody Product productDetail(@RequestBody Product product){

		System.out.println("productDetail");
		for(int i = 0; i < productDao.getProductList().size(); i++){
			if(product.getProductId().equals(productDao.getProductList().get(i).getProductId())){
				product = productDao.getProductList().get(i);
			}
		}
		return product;
	}
	
	
	/*@RequestMapping("/productList")
	public @ResponseBody List<Product> productList(@RequestBody Product product ){
		
		System.out.println(product.getProductName());
		
		System.out.println("productList");
		List<Product> products = productDao.getProductList();
		
		return products;
	}*/
	
}
