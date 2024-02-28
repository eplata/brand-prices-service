package mx.com.kairos.brandprices.application.services;

import java.time.LocalDateTime;
import java.util.Optional;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import mx.com.kairos.brandprices.domain.model.Price4Brand;
import mx.com.kairos.brandprices.domain.port.in.GetProductPrice4BrandUseCase;


@Getter
@Setter
@AllArgsConstructor
public class ProductPrices4BrandService implements GetProductPrice4BrandUseCase{

	
	private final GetProductPrice4BrandUseCase getProductPrice4BrandUseCase;
	
	@Override
	public Optional<Price4Brand> getPrice4BrandAndDate(Long productId, Long brandId, LocalDateTime applicableDate) {
		return getProductPrice4BrandUseCase.getPrice4BrandAndDate(productId, brandId, applicableDate);
	}

	
}
