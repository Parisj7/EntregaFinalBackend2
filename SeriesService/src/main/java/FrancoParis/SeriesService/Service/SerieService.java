package FrancoParis.SeriesService.Service;


import FrancoParis.SeriesService.Model.Serie;
import FrancoParis.SeriesService.Repository.SerieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SerieService implements ISerieService{

    @Autowired
    private SerieRepository serieRepository;

    @Override
    public List<Serie> getAllSeries() {
        return serieRepository.findAll();
    }

    @Override
    public List<Serie> findByGenre(String genre) {
        return serieRepository.findAllByGenre(genre);
    }

    @Override
    public Serie save(Serie serie) {
        return serieRepository.save(serie);
    }


}
