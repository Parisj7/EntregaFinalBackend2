package com.dh.catalogservice.domain.repository;

import com.dh.catalogservice.domain.model.MovieWS;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name = "movie-service")
public interface MovieRepository {
    @GetMapping("/movies/{genre}")
    ResponseEntity<List<MovieWS>> getMoviesByGenre(@PathVariable String genre);
}