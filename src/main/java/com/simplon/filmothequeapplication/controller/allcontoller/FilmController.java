package com.simplon.filmothequeapplication.controller.allcontoller;

import com.simplon.filmothequeapplication.service.FilmService;
import com.simplon.filmothequeapplication.storage.entity.FilmEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.Optional;

@RestController
@RequestMapping("/filmotheque")
@CrossOrigin(origins = "http://localhost:4200")
public class FilmController {

    @Autowired
    private FilmService filmService;

    @GetMapping("/catalogue")
//    produces = MediaType.APPLICATION_JSON_VALUE)
    public List<FilmEntity> getAllFilms() throws IOException {
        return this.filmService.getAllFilms();
    }

    @GetMapping ("/catalogue/{id}")
//    produces = MediaType.APPLICATION_JSON_VALUE) TODO: kell ez a JSON kitetel ide?
//    TODO: ugye lehet mas a méthode név itt es a ServiceImpl-ben?
    public Optional<FilmEntity> getFilmById(@PathVariable Long id) throws IOException {

        return filmService.getFilmById(id);
    }
//TODO: see endpoints names!!! <<< swagger/openapi!!!
    @PostMapping("/catalogue")
//    consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
//    TODO: conseil SonarLint: Replace this persistent entity with a simple POJO or DTO object. !!!
//    TODO: revoir @RequestBody et @PathVariable!!!
    public FilmEntity createFilm(@RequestBody FilmEntity filmEntity) {

        return filmService.createFilm(filmEntity);
    }


    @PutMapping("/catalogue/{id}")
//     consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public FilmEntity updateFilm(@RequestBody FilmEntity filmEntity, @PathVariable Long id) {

        return filmService.updateFilm(filmEntity);
    }

    @DeleteMapping("/catalogue/{id}")
    public Map<String, String> deleteFilm(@PathVariable Long id) {

        return filmService.deleteFilm(id);
    }
}
