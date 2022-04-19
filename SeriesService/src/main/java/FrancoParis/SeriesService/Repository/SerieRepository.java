package FrancoParis.SeriesService.Repository;

import FrancoParis.SeriesService.Model.Serie;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SerieRepository extends MongoRepository<Serie, String> {

    List<Serie> findAllByGenre(String genre);
}