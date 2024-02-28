package mx.com.kairos.brandprices.application.usecases;

import java.time.LocalDateTime;
import java.util.Optional;

import lombok.AllArgsConstructor;
import mx.com.kairos.brandprices.domain.model.Price4Brand;
import mx.com.kairos.brandprices.domain.port.in.GetProductPrice4BrandUseCase;
import mx.com.kairos.brandprices.domain.port.out.ProductPricesRepositoryPort;

@AllArgsConstructor
public class GetProductPrice4BrandUseCaseImpl implements GetProductPrice4BrandUseCase{

	private final ProductPricesRepositoryPort productPricesRepositoryPort;
	
	@Override
	public Optional<Price4Brand> getPrice4BrandAndDate(Long productId, Long brandId, LocalDateTime applicableDate) {
		return productPricesRepositoryPort.getPrice4BrandAndDate(productId, brandId, applicableDate);
	}

}
