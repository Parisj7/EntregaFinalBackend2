package com.dh.catalogservice.domain.repository;

import com.dh.catalogservice.domain.model.SeriesWS;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SerieswsRepository extends MongoRepository<SeriesWS,String> {
    public List<SeriesWS> findAllByGenre(String genre);
}
