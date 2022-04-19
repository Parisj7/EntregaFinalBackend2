package FrancoParis.SeriesService.Service;

import FrancoParis.SeriesService.Model.Serie;

import java.util.List;

public interface ISerieService {

    List<Serie> getAllSeries();
    List<Serie> findByGenre(String genre);
    Serie save(Serie serie);

}
