package mx.com.kairos.brandprices.domain.model;

import java.time.LocalDateTime;

import lombok.Data;

@Data
public class Price4Brand {

	private Integer priceList;
	private Long brandId;
	private LocalDateTime startDate;
	private LocalDateTime endDate;
	private Long productId;
	private Integer priority;
	private Double price;
	private String currency;
	private LocalDateTime lastUpdate;
	private String lastUpdateBy;
	
}
