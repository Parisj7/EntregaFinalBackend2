package com.dh.catalogservice.domain.repository;

import com.dh.catalogservice.domain.model.SeriesWS;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name = "series-service")
public interface SeriesRepository {
    @GetMapping("/series/{genre}")
    ResponseEntity<List<SeriesWS>> getSeriesByGenre(@PathVariable String genre);
}
