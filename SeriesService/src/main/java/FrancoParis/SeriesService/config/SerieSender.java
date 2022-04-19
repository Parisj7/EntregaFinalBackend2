package FrancoParis.SeriesService.config;

import FrancoParis.SeriesService.Model.Serie;
import FrancoParis.SeriesService.Service.SerieService;
import lombok.RequiredArgsConstructor;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.stereotype.Component;

@RequiredArgsConstructor
@Component
public class SerieSender {

    private final SerieService serieService;

    private final RabbitTemplate rabbitTemplate;

    private final Queue queueSerie;


    public Serie send(Serie serie){
        rabbitTemplate.convertAndSend(queueSerie.getName(),serieService.save(serie));
        return serie;
    }
}
