package learn.springboot.serivce;

import learn.springboot.domain.Anime;
import learn.springboot.repository.AnimeRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service //Adiciona esta classe como um Bean a ser mapeado pelo Srping para poder ser inicializado como serviço em outros lugares
public class AnimeService implements AnimeRepository {
    private List<Anime> animes = List.of(new Anime("DBZ", 1L), new Anime("Naruto", 2L));
    private ResponseStatusException badRequest = new ResponseStatusException(HttpStatus.BAD_REQUEST, "Anime not found");
    public List<Anime> listAll() {
        return animes;
    }
    public Anime getById(long id) {
        // Adding getById method
        return animes.stream()
                .filter(a -> a.getId().equals(id))
                .findFirst()
                .orElseThrow(() -> badRequest);
    }
    public Anime getByName(String name) {
        // Adding getByName method
        return animes.stream()
                .filter(a -> a.getName().equalsIgnoreCase(name))
                .findFirst()
                .orElseThrow(() -> badRequest);
    }

}
