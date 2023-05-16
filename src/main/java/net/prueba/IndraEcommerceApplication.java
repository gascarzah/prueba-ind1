package net.prueba;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class IndraEcommerceApplication {

	public static void main(String[] args) {
		SpringApplication.run(IndraEcommerceApplication.class, args);
	}

	
//	@Bean
//	CommandLineRunner run(IPricesService iPricesService) {
//		
//		return args -> {
//			
//		    Prices.builder()
//		    .brandId(1)
//		    .startDate(null)
//		    .endDate(null)
//		    .priceList(1)
//		    .productId(35455)
//		    .priority(0)
//		    .price(35.5)
//		    .curr("EUR")
//		    .build();
//		
//
//		};
	
}
