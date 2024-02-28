package mx.com.kairos.brandprices.domain.port.in;

import java.time.LocalDateTime;
import java.util.Optional;

import mx.com.kairos.brandprices.domain.model.Price4Brand;

/**
 * Use Case that retrives the prices for a specified product, brand
 * and date
 * 
 * @author emmanuel.plata.alvarado@kariosds.com
 *
 */
public interface GetProductPrice4BrandUseCase {


	/**
	 * 
	 * @param productId
	 * @param brandId
	 * @param applicableDate
	 * @return
	 */
	Optional<Price4Brand> getPrice4BrandAndDate(Long productId, Long brandId, LocalDateTime applicableDate);
	
}
