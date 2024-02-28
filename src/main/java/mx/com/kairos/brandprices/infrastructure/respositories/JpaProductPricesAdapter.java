package mx.com.kairos.brandprices.infrastructure.respositories;

import java.time.LocalDateTime;
import java.util.Optional;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import mx.com.kairos.brandprices.domain.model.Price4Brand;
import mx.com.kairos.brandprices.domain.port.out.ProductPricesRepositoryPort;
import mx.com.kairos.brandprices.infrastructure.entities.Prices;
import mx.com.kairos.brandprices.infrastructure.mapper.ProductPriceMapper;

@Component
@AllArgsConstructor
public class JpaProductPricesAdapter implements ProductPricesRepositoryPort{

	private final JpaProductPrices4BrandRepository jpaProductPrices4BrandRepository;
	
	@Override
	public Optional<Price4Brand> getPrice4BrandAndDate(Long productId, Long brandId, LocalDateTime applicableDate) {
		
		Optional<Prices> productPriceEntity = jpaProductPrices4BrandRepository.findByProductIdBrandIdAndDate(productId, brandId, applicableDate); 
		
		if(productPriceEntity.isPresent()) {			
			return Optional.of(ProductPriceMapper.INSTANCE.toDomain(productPriceEntity.get()));
		}
		
		return Optional.empty();
	}

}
