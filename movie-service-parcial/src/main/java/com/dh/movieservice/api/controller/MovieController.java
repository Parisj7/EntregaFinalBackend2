package com.dh.movieservice.api.controller;

import com.dh.movieservice.api.config.MovieSender;
import com.dh.movieservice.api.service.MovieService;
import com.dh.movieservice.domain.model.Movie;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("/movies")
public class MovieController {
	private MovieService movieService;
	private MovieSender movieSender;

	@Autowired
	public MovieController(MovieService movieService, MovieSender movieSender) {
		this.movieService = movieService;
		this.movieSender = movieSender;
	}

	@GetMapping("/{genre}")
	public ResponseEntity<List<Movie>> getMovieByGenre(@PathVariable String genre) {
		log.info("Buscarmovies por genero:",genre);
		return ResponseEntity.ok().body(movieService.getListByGenre(genre));
	}

	@PostMapping
	public ResponseEntity<Movie> saveMovie(@RequestBody Movie movie) {
		log.info("se guardo la pelicula: ",movie.getName());
		return ResponseEntity.ok().body(movieSender.send(movie));
	}
}
