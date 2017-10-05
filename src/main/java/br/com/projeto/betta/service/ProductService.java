package br.com.projeto.betta.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.projeto.betta.entity.Product;
import br.com.projeto.betta.repository.ProductRepository;

@Service
public class ProductService {
	
	@Autowired
	private ProductRepository productRepository;
	
	
	public List<Product>getAllProducts(){
		
		return (List<Product>) productRepository.findAll();	
	}
	
	
	public void saveProduct(Product product){
		productRepository.save(product);
	}
	
	public void updateProduct(Product product){
		productRepository.save(product);
	}
	
	
	public Product getProduct(Integer id){
		return productRepository.findOne(id);
	}
	
	public boolean deleteProduct(Integer id){
		productRepository.delete(id);
		return true;
	}

}
