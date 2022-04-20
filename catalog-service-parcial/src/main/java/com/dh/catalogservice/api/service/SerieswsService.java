package com.dh.catalogservice.api.service;

import com.dh.catalogservice.domain.model.SeriesWS;

import java.util.List;

public interface SerieswsService {
    public SeriesWS saveSeriesws(SeriesWS serieWS);
    List<SeriesWS> findseriesByGenre(String genre);
}
