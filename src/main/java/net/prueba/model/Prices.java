package net.prueba.model;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@Entity
@Table
@AllArgsConstructor
@NoArgsConstructor

@Builder
public class Prices {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer pricesId;
	private Integer brandId;

	private LocalDateTime startDate;
	private LocalDateTime endDate;

	private Integer priceList;
	private Integer productId;
	private Integer priority;
	private Double price;
	private String curr;
}
