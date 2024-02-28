package mx.com.kairos.brandprices.infrastructure.controllers;

import java.time.LocalDateTime;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/prices")
public class PricesBrandController {
	
	
	@GetMapping(value="/{productId}/{brandId}")
	public ResponseEntity<Void> getProductPriceBrandAndDate(
			@RequestParam("start") 
            @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME) 
            LocalDateTime applicableDate 
			){
		
		
		return null;
	}

}
