package net.prueba.service;

import java.time.LocalDateTime;
import java.util.List;

import net.prueba.model.Prices;

public interface IPricesService {
//	public List<Prices> listar();

	public List<Prices> listarPorParametros(LocalDateTime dateTime, Integer productId, Integer brandId);
}
