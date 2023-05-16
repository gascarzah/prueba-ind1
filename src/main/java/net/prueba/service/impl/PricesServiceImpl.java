package net.prueba.service.impl;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import org.springframework.stereotype.Service;

import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import net.prueba.model.Prices;
import net.prueba.repository.PricesRepository;
import net.prueba.service.IPricesService;

@Service
@Transactional
@AllArgsConstructor
public class PricesServiceImpl implements IPricesService{

	private PricesRepository pricesRepository;
	

	@Override
	public List<Prices> listarPorParametros(LocalDateTime dateTime, Integer productId, Integer brandId) {
		Comparator<Prices> comparador = Comparator.comparing(Prices::getPrice);
		var listPrices = pricesRepository.listarPorParametros(dateTime, productId, brandId);
		
		List<Prices> lista = new ArrayList<>();
		if(!listPrices.isEmpty())
			lista.add(listPrices.stream().max(comparador).get());
			
		
		return lista;
	}
	
	
}
