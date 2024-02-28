package mx.com.kairos.brandprices.domain.port.out;

import java.time.LocalDateTime;
import java.util.Optional;

import mx.com.kairos.brandprices.domain.model.Price4Brand;

/**
 * Entry point for upper layers to domain layer
 * 
 * @author emmanuel.plata.alvarado@kairosds.com
 *
 */
public interface ProductPricesRepositoryPort {
	

	/**
	 * Return the Product's price with specified parameters
	 * 
	 * @param productId
	 * @param brandId
	 * @param applicableDate
	 * @return
	 */
	Optional<Price4Brand> getPrice4BrandAndDate(Long productId, Long brandId, LocalDateTime applicableDate);

}
