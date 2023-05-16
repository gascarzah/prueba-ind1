package net.prueba.repository;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import net.prueba.model.Prices;

@Repository
public interface PricesRepository  extends JpaRepository<Prices, Long>{

	@Query("select p from Prices p where p.startDate <= :fecha and :fecha <= p.endDate and p.productId = :productId and p.brandId = :brandId")
	List<Prices> listarPorParametros(LocalDateTime fecha, Integer productId, Integer brandId);


}
