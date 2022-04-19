package com.dh.catalogservice.api.service.impl;

import com.dh.catalogservice.api.service.SerieswsService;
import com.dh.catalogservice.domain.model.SeriesWS;
import com.dh.catalogservice.domain.repository.SerieswsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SeriewsServiceImpl implements SerieswsService {

    @Autowired
    private SerieswsRepository repository;

    @Override
    public SeriesWS saveSeriesws(SeriesWS serieWS) {
        return repository.save(serieWS);
    }

    @Override
    public List<SeriesWS> findseriesByGenre(String genre) {
        return repository.findAllByGenre(genre);
    }
}