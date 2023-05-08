package learn.springboot.serivce;

import learn.springboot.domain.Anime;
import learn.springboot.repository.AnimeRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service //Adiciona esta classe como um Bean a ser mapeado pelo Srping para poder ser inicializado como serviço em outros lugares
public class AnimeService implements AnimeRepository {
    public List<Anime> listAll() {
        return List.of(new Anime("DBZ", 1L), new Anime("Naruto", 2L));
    }
}
