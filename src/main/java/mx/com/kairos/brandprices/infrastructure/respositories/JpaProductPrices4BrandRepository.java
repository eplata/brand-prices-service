package mx.com.kairos.brandprices.infrastructure.respositories;

import java.time.LocalDateTime;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import mx.com.kairos.brandprices.infrastructure.entities.Prices;

/**
 * Interface that obtains the Product's prices from Prices Entity
 * using JPA 
 * 
 * @author 
 *
 */
@Repository
public interface JpaProductPrices4BrandRepository  extends JpaRepository<Prices, Long> {

   /**
    * 	
    * @return
    */
	@Query("SELECT p FROM Prices p WHERE p.productId=?1 AND p.brandId=?2 AND p.startDate<=?3 AND p.endDate>=?3 order by priority desc limit 1")
	public Optional<Prices> findByProductIdBrandIdAndDate(Long productId, Long brandId, LocalDateTime applicableDate);
}
