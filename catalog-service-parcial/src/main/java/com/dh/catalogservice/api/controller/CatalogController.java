package com.dh.catalogservice.api.controller;

import com.dh.catalogservice.api.service.CatalogService;
import com.dh.catalogservice.domain.model.CatalogWS;
import com.dh.catalogservice.domain.model.MovieWS;
import com.dh.catalogservice.domain.repository.SerieswsRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.HashMap;
import java.util.Map;


@Slf4j
@RestController
@RequestMapping("/catalog")
public class CatalogController {

	@Autowired
	private CatalogService catalogService;

	@Autowired
	private SerieswsRepository repository;

	@GetMapping("/{genre}")
	ResponseEntity<CatalogWS> getCatalogByGenre(@PathVariable String genre) {
		log.info("Buscar catalogo por genero:",genre);
//		repository.save(catalogService.getCatalogByGenre(genre).getSeries().get(1));
		return ResponseEntity.ok().body(catalogService.getCatalogByGenre(genre));
	}

}