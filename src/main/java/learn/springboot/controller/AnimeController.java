package learn.springboot.controller;

import learn.springboot.domain.Anime;
import learn.springboot.utils.DateUtil;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequestMapping("anime") //localhost:8080/anime
@Log4j2
@RequiredArgsConstructor // Essa annotation inicia todsas as variaveis "final"
public class AnimeController {
    private final DateUtil dateUtil;
    @GetMapping("list")
    public List<Anime> list() {

        log.info("AnimeController/(GET)list -> " + dateUtil.formatLocalToDbDateTime(LocalDateTime.now()));
        return List.of(new Anime("DBZ"), new Anime("Berserk"));
    }
}
