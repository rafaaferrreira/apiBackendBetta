package br.com.projeto.betta.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.projeto.betta.entity.Image;
import br.com.projeto.betta.entity.Product;
import br.com.projeto.betta.repository.ImageRepository;
import br.com.projeto.betta.repository.ProductRepository;

@Service
public class ImageService {
	
	
	@Autowired
	private ImageRepository imageRepository;
	
	@Autowired
	private ProductRepository productRepository;
	
	
	public List<Image> getAllImagens(){
		return (List<Image>) imageRepository.findAll();
	}
	
	
	public void saveImage(Image image){
		imageRepository.save(image);
	}
	
	
	public List<Image> getImagesByProduct(Integer id){
		Product product = productRepository.findOne(id);
		return imageRepository.findByProduct(product);
	}
	
	
	public void updateImage(Image image){
		imageRepository.save(image);
	}
	
	public boolean deleteImage(Integer id){
		imageRepository.delete(id);
		return true;
	}
	
	public Image getImage(Integer id){
		return imageRepository.findOne(id);
	}
	

	
}
