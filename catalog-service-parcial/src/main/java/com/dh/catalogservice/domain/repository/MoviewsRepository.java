package com.dh.catalogservice.domain.repository;

import com.dh.catalogservice.domain.model.MovieWS;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MoviewsRepository extends MongoRepository<MovieWS,Integer> {
    public List<MovieWS> findAllByGenre(String genre);
}
