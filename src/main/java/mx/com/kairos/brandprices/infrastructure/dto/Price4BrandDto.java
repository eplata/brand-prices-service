package mx.com.kairos.brandprices.infrastructure.dto;

import java.time.LocalDateTime;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Price4BrandDto {

	
	private Integer priceList;
	private Long brandId;
	private LocalDateTime startDate;
	private LocalDateTime endDate;
	private Long productId;
    @JsonIgnore
	private Integer priority;
	private Double price;
	@JsonIgnore
	private String currency;
	@JsonIgnore
	private LocalDateTime lastUpdate;
	@JsonIgnore
	private String lastUpdateBy;
}
