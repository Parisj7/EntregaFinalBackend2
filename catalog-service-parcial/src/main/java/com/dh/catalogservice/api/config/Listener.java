package com.dh.catalogservice.api.config;


import com.dh.catalogservice.api.service.MoviewsService;
import com.dh.catalogservice.api.service.SerieswsService;
import com.dh.catalogservice.domain.model.MovieWS;
import com.dh.catalogservice.domain.model.SeriesWS;
import com.dh.catalogservice.domain.repository.SerieswsRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

@Slf4j
@RequiredArgsConstructor
@Component
public class Listener {
    @Autowired
    private MoviewsService movieWSService;

    @Autowired
    private SerieswsRepository repository;

    @RabbitListener(queues = {"${queue.movie.name}"})
    public void receive(@Payload MovieWS movieWS){
        log.info("Se guarda la pelicula:",movieWS.getName());
        movieWSService.saveMoviews(movieWS);
    }

    @RabbitListener(queues = {"${queue.serie.name}"})
    public void receive(@Payload SeriesWS serieWS){
        System.out.println("pinguinos aqui");
        log.info("Se guardo la seriesw:",serieWS.getName());
        repository.save(serieWS);
    }
}