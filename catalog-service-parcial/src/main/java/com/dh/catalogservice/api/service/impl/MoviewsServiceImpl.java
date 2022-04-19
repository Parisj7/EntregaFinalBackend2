package com.dh.catalogservice.api.service.impl;

import com.dh.catalogservice.api.service.MoviewsService;
import com.dh.catalogservice.domain.model.MovieWS;
import com.dh.catalogservice.domain.repository.MoviewsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MoviewsServiceImpl implements MoviewsService {

    @Autowired
    private MoviewsRepository repository;

    @Override
    public MovieWS saveMoviews(MovieWS movieWS) {
        return repository.save(movieWS);
    }

    @Override
    public List<MovieWS> findMoviesByGenre(String genre) {
        return repository.findAllByGenre(genre);
    }
}