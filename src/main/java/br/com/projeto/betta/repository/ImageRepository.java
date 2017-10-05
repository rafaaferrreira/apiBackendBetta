package br.com.projeto.betta.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.projeto.betta.entity.Image;
import br.com.projeto.betta.entity.Product;

@Repository
public interface ImageRepository extends CrudRepository<Image, Integer>{
	
	List<Image> findByProduct(Product product);

}
