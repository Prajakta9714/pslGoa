package com.springmvcone;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class ProductRestController {

	private List<Product> products = new ArrayList<>();
	
	public ProductRestController() {
		products.add(new Product("1","Pen",100));
		products.add(new Product("2","Pencil",150));
	}
	
	
	
	
	//@RequestMapping(path = "/products" , method = RequestMethod.GET)
	@GetMapping("/products")
	public List<Product> getProduct(){
		return products;
	 }
	
	@RequestMapping("/products")
	public void add(@RequestBody Product p) {
		products.add(p);
	}
	
	@DeleteMapping("/products/{code}")
	public void delete(@PathVariable("code") String code) {
		int x =-1;
		for(int i =0;i<products.size();i++) {
			if(products.get(i).getCode().equals(code)) {
				x = i;
				break;
			}
		}
		if(x!= -1) {
			products.remove(x);
		}
	}
	
	@PutMapping("/products/{code}")
	public void update() {
		
	}
}
