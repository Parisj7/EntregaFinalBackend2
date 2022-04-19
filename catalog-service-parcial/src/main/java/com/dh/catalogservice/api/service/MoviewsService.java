package com.dh.catalogservice.api.service;

import com.dh.catalogservice.domain.model.MovieWS;

import java.util.List;

public interface MoviewsService {
    public MovieWS saveMoviews(MovieWS movieWS);
    public List<MovieWS> findMoviesByGenre(String genre);
}
