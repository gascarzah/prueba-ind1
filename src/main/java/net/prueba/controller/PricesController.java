package net.prueba.controller;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j2;
import net.prueba.model.Prices;
import net.prueba.service.IPricesService;

@RestController
@RequestMapping("/prices")
@AllArgsConstructor
@Log4j2
public class PricesController {

	private IPricesService iPricesService;
	
//	@GetMapping
//	public ResponseEntity<List<Prices>> listar() throws Exception{
//		List<Prices> lista = iPricesService.listar();
//		if (lista.isEmpty()) {
//            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
//        }
//		return new ResponseEntity<List<Prices>>(lista, HttpStatus.OK);
//	}
	
	@GetMapping
	public ResponseEntity<List<Prices>> listarPorId(
//			@RequestParam("date") @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME) LocalDateTime date,
			@RequestParam("date")String date,
			@RequestParam("productId") Integer productId,
			@RequestParam("brandId") Integer brandId) throws Exception{
		
		log.info("date "+date);
		log.info("productId "+productId);
		log.info("brandId "+brandId);
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
		LocalDateTime dateTime = LocalDateTime.parse(date, formatter);
		log.info("date parseado "+dateTime);
		
		List<Prices> lista = iPricesService.listarPorParametros(dateTime, productId, brandId);
		return new ResponseEntity<List<Prices>>(lista, HttpStatus.OK);
	}
}
