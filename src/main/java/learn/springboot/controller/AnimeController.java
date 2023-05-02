package learn.springboot.controller;

import learn.springboot.domain.Anime;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController // Annotation para dizer que essa classe é um controller od tipo Rest
@RequestMapping("anime") //localhost:8080/anime
public class AnimeController {
    @GetMapping("list")
    public List<Anime> list() {
        return List.of(new Anime("DBZ"), new Anime("Berserk"));
    }
}
