package com.dh.movieservice.api.config;

import com.dh.movieservice.api.service.MovieService;
import com.dh.movieservice.domain.model.Movie;
import lombok.RequiredArgsConstructor;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.stereotype.Component;

@RequiredArgsConstructor
@Component
public class MovieSender {

    private final MovieService movieService;

    private final RabbitTemplate rabbitTemplate;

    private final Queue queueMovie;

    public Movie send(Movie movie){
        rabbitTemplate.convertAndSend(queueMovie.getName(),movieService.save(movie));
        return movie;
    }
}
