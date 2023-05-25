package learn.springboot.controller;

import jakarta.websocket.server.PathParam;
import learn.springboot.domain.Anime;
import learn.springboot.serivce.AnimeService;
import learn.springboot.utils.DateUtil;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequestMapping("animes") //localhost:8080/animes
@Log4j2
@RequiredArgsConstructor
public class AnimeController {
    private final DateUtil dateUtil;
    private final AnimeService animeService;

    @GetMapping
    public ResponseEntity<List<Anime>> list() {

        log.info("AnimeController/(GET)list -> " + dateUtil.formatLocalToDbDateTime(LocalDateTime.now()));

        return ResponseEntity.ok(animeService.listAll());
    }

    @GetMapping(path = "/{id}") //Using Path variable -> e.g.: ./1
    public ResponseEntity<Anime> getById(@PathVariable long id) {
        return ResponseEntity.ok(animeService.getById(id));
    }

    @GetMapping("/") //Using request param -> e.g.: ./?name=Naruto
    public ResponseEntity<Anime> getByName(@RequestParam(name = "name") String name){
        return ResponseEntity.ok(animeService.getByName(name));
    }
}
