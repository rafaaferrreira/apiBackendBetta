package br.com.projeto.betta.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.projeto.betta.entity.Product;

@Repository
public interface ProductRepository extends CrudRepository<Product, Integer>{
	
}
