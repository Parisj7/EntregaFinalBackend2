package FrancoParis.SeriesService.Controller;

import FrancoParis.SeriesService.Model.Serie;
import FrancoParis.SeriesService.Service.SerieService;
import FrancoParis.SeriesService.config.SerieSender;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("/series")
public class SerieController {

    private final SerieService serieService;
    private final SerieSender serieSender;

    @Autowired
    public SerieController(SerieService serieService,SerieSender serieSender) {
        this.serieService = serieService;
        this.serieSender = serieSender;
    }

    @GetMapping("/all")
    public ResponseEntity<List<Serie>> findAllSerie(){
        return ResponseEntity.ok().body(serieService.getAllSeries());
    }

    @GetMapping("{genre}")
    public ResponseEntity<List<Serie>> findAllByGenre(@PathVariable String genre){
        log.info("busquedas con genero:",genre);
        return ResponseEntity.ok().body(serieService.findByGenre(genre));
    }

    @PostMapping("save")
    public ResponseEntity<Serie> saveSerie(@RequestBody Serie serie){
        log.info("se guardo la serie: ",serie.getName());
        return ResponseEntity.ok().body(serieService.save(serie));
    }
}