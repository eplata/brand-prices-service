package mx.com.kairos.brandprices.infrastructure.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import mx.com.kairos.brandprices.domain.model.Price4Brand;
import mx.com.kairos.brandprices.infrastructure.dto.Price4BrandDto;
import mx.com.kairos.brandprices.infrastructure.entities.Prices;

@Mapper
public interface ProductPriceMapper {

	ProductPriceMapper INSTANCE = Mappers.getMapper(ProductPriceMapper.class);
	
	
	Price4BrandDto toDto(Prices prices);
	
	Price4Brand toDomain(Prices prices);
	
	
	Price4Brand toDomain(Price4BrandDto price4BrandDto);
	
	
	
}
