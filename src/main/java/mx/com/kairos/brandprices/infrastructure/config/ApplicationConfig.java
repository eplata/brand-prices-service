package mx.com.kairos.brandprices.infrastructure.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import mx.com.kairos.brandprices.application.services.ProductPrices4BrandService;
import mx.com.kairos.brandprices.application.usecases.GetProductPrice4BrandUseCaseImpl;
import mx.com.kairos.brandprices.domain.port.out.ProductPricesRepositoryPort;
import mx.com.kairos.brandprices.infrastructure.respositories.JpaProductPricesAdapter;

@Configuration
public class ApplicationConfig {

	@Bean
	public ProductPrices4BrandService productPrices4BrandService(ProductPricesRepositoryPort productPricesRepositoryPort) {
		return new ProductPrices4BrandService(
				new GetProductPrice4BrandUseCaseImpl(productPricesRepositoryPort)
				);
	}
	
	@Bean
	public ProductPricesRepositoryPort productPricesRepositoryPort(JpaProductPricesAdapter jpaProductPricesAdapter) {
		
		return jpaProductPricesAdapter;
	}
	
	
}
