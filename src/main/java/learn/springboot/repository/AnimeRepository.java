package learn.springboot.repository;

import learn.springboot.domain.Anime;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AnimeRepository {
    public List<Anime> listAll();
}
