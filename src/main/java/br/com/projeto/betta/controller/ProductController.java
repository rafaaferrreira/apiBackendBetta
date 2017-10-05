package br.com.projeto.betta.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


import br.com.projeto.betta.entity.Product;

import br.com.projeto.betta.service.ProductService;

//@Controller
@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping(value = "/products")
public class ProductController {
	
	@Autowired
	private ProductService productService;
	
	private Product product;
	
	
	@RequestMapping(value = "/getAllProducts", method = RequestMethod.GET)
	@ResponseBody
    public List<Product> getAllProducts() {
        return productService.getAllProducts();
    }
	
	
	@RequestMapping(value = "/saveProduct", method = RequestMethod.POST)
	@ResponseBody
    public Product save(@RequestBody Product product) {
        productService.saveProduct(product);
        
        return product;
    }
	
	
	@RequestMapping(value = "/updateProduct", method = RequestMethod.PUT)
	public Product updateProduct(@RequestBody Product product) {

		Product prod = new Product();
		
		prod.setId(product.getId());
		prod.setDescription(product.getDescription());
		prod.setName(product.getName());
		
		productService.updateProduct(prod);
        
        return prod;
	}
	
	
	@RequestMapping(value = "/getProduct/{id}", method = RequestMethod.GET)
	public Product getProduct(@PathVariable("id") Integer id) {
		productService.getProduct(id);
		product = productService.getProduct(id);
		return product;
	}
	
	
	@RequestMapping(value = "/deleteProduct/{id}", method = RequestMethod.DELETE)
	public boolean deleteProduct(@PathVariable Integer id) {
		if(productService.deleteProduct(id)){
			return true;
		}else{
			return false;
		}
	}
	
	

}
