package com.dh.catalogservice.api.config;


import com.dh.catalogservice.api.service.MoviewsService;
import com.dh.catalogservice.api.service.SerieswsService;
import com.dh.catalogservice.domain.model.MovieWS;
import com.dh.catalogservice.domain.model.SeriesWS;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

@Slf4j
@RequiredArgsConstructor
@Component
public class Listener {
    @Autowired
    private MoviewsService movieWSService;

    @Autowired
    private SerieswsService serieWSService;

    @RabbitListener(queues = {"${queue.movie.name}"})
    public void receive(@Payload MovieWS movieWS){
        log.info("Se guarda la pelicula:",movieWS.getName());
        movieWSService.saveMoviews(movieWS);
    }

    @RabbitListener(queues = {"${queue.serie.name}"})
    public void receive(@Payload SeriesWS serieWS){
        log.info("Se guardo la serie:",serieWS.getName());
        serieWSService.saveSeriesws(serieWS);
    }
}