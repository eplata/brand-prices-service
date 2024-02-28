package mx.com.kairos.brandprices.infrastructure.entities;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "PRICES")
public class Prices {


	@Id
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
