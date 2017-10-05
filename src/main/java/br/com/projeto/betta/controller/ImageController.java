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

import br.com.projeto.betta.entity.Image;
import br.com.projeto.betta.entity.Product;
import br.com.projeto.betta.service.ImageService;
import br.com.projeto.betta.service.ProductService;





//@Controller
@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping(value = "/images")
public class ImageController {
	
	@Autowired
	private ImageService imageService;
	@Autowired ProductService productService;
	
	private Image image;
	private Product product;
	
	@RequestMapping(value = "/getAllImages", method = RequestMethod.GET)
	@ResponseBody
    public List<Image> getAllImages() {
        return imageService.getAllImagens();
    }
	
	
	
	@RequestMapping(value = "/saveImage", method = RequestMethod.POST)
	@ResponseBody
    public Image save(@RequestBody Image image) {
		Product product = new Product();
		product = productService.getProduct(image.getId());
		
		Image img = new Image();
		img.setId(null);
		img.setType(image.getType());
		img.setProduct(product);
		
		imageService.saveImage(img);
        
        return img;
    }
	
	@RequestMapping(value = "/getImagesByProduct/{id}", method = RequestMethod.GET)
	@ResponseBody
    public List<Image> getImagesByProduct(@PathVariable Integer id) {
        return imageService.getImagesByProduct(id);
    }
	
	
	@RequestMapping(value = "/updateImage", method = RequestMethod.PUT)
	public Image updateImage(@RequestBody Image image) {
		Image img = new Image();
		img = imageService.getImage(image.getId());
		product = img.getProduct();
		
		img.setId(image.getId());
		img.setType(image.getType());
		img.setProduct(product);
		
		imageService.updateImage(img);
        
        return img;
	}
	
	
	@RequestMapping(value = "/deleteImage/{id}", method = RequestMethod.DELETE)
	public boolean deleteImage(@PathVariable Integer id) {
		if(imageService.deleteImage(id)){
			return true;
		}else{
			return false;
		}
	}
	
	@RequestMapping(value = "/getImage/{id}", method = RequestMethod.GET)
	public Image getImage(@PathVariable("id") Integer id) {
		//imageService.getImage(id);
		image = imageService.getImage(id);
		return image;
	}
	
	
	

}
