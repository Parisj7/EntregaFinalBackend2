package com.dh.catalogservice.api.service.impl;

import com.dh.catalogservice.api.service.CatalogService;
import com.dh.catalogservice.domain.model.CatalogWS;
import com.dh.catalogservice.domain.model.MovieWS;
import com.dh.catalogservice.domain.model.SeriesWS;
import com.dh.catalogservice.domain.repository.MovieRepository;
import com.dh.catalogservice.domain.repository.SeriesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CatalogServiceImpl implements CatalogService {

    @Autowired
    private MovieRepository movieRepository;

    @Autowired
    private SeriesRepository serieRepository;

    @Override
    public CatalogWS getCatalogByGenre(String genre){
        List<MovieWS> moviesWS = getMoviesByGenre(genre);
        List<SeriesWS> seriesWS = getSeriesByGenre(genre);
        return new CatalogWS(genre,moviesWS,seriesWS);
    }


    public List<MovieWS> getMoviesByGenre(String genre){
        return movieRepository.getMoviesByGenre(genre).getBody();
    }


    public List<SeriesWS> getSeriesByGenre(String genre){
        return serieRepository.getSeriesByGenre(genre).getBody();
    }

}