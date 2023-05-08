package learn.springboot.controller;

import learn.springboot.domain.Anime;
import learn.springboot.serivce.AnimeService;
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
@RequestMapping("animes") //localhost:8080/anime
@Log4j2
@RequiredArgsConstructor
public class AnimeController {
    private final DateUtil dateUtil;
    private final AnimeService animeService;
    @GetMapping("list")
    public List<Anime> list() {

        log.info("AnimeController/(GET)list -> " + dateUtil.formatLocalToDbDateTime(LocalDateTime.now()));

        return animeService.listAll();
    }
}
