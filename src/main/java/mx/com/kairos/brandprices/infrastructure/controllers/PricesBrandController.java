package mx.com.kairos.brandprices.infrastructure.controllers;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Optional;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import mx.com.kairos.brandprices.application.services.ProductPrices4BrandService;
import mx.com.kairos.brandprices.domain.model.Price4Brand;
import mx.com.kairos.brandprices.infrastructure.dto.Price4BrandDto;
import mx.com.kairos.brandprices.infrastructure.mapper.ProductPriceMapper;

@RestController
@RequestMapping("/api/prices")
public class PricesBrandController {
	
	private final ProductPrices4BrandService productPrices4BrandService;
	
	public PricesBrandController(ProductPrices4BrandService productPrices4BrandService) {
		this.productPrices4BrandService = productPrices4BrandService;
	}
	
	@GetMapping(value="/produtc/{productId}/brand/{brandId}")
	public ResponseEntity<Price4BrandDto> getProductPriceBrandAndDate(
			@PathVariable Long productId,
			@PathVariable Long brandId,
			@RequestParam("applicableDate")  String applicableDate 
			){
		
	    //Create a DateTimeFormatter with your required format:
	   DateTimeFormatter dateTimeFormat =  DateTimeFormatter.ofPattern("yyyy-MM-ddHH:mm");

	   LocalDateTime date = dateTimeFormat.parse(applicableDate, LocalDateTime::from);
		
		Optional<Price4Brand> productPrice = productPrices4BrandService.getPrice4BrandAndDate(productId, brandId, date); 
		
		if(productPrice.isPresent()) {			
			return  new ResponseEntity<>(ProductPriceMapper.INSTANCE.toDto(productPrice.get()), HttpStatus.OK); 
		}else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
		
	}

}
