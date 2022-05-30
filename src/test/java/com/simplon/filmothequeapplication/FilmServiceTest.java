package com.simplon.filmothequeapplication;

import com.simplon.filmothequeapplication.model.FilmDto;
import com.simplon.filmothequeapplication.service.FilmService;
import com.simplon.filmothequeapplication.service.impl.FilmServiceImpl;
import com.simplon.filmothequeapplication.storage.dao.FilmDao;
import com.simplon.filmothequeapplication.storage.entity.FilmEntity;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import java.io.IOException;
import java.util.Optional;
import java.util.Random;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
public class FilmServiceTest {

    @Autowired
    private FilmDao filmDao;

    @Autowired
    private FilmService filmService;

//    @MockBean
//    private FilmServiceImpl filmServiceImpl;


//    @AfterEach
//    public void cleanData() {
//        filmDao.deleteAll();
//    }

//    TODO: ici, il faudrait travailler sur FilmDto une fois tout est corrigé dans FilmService/FilmServiceImpl/FilmController
    private FilmEntity initialisationFilmEntity() {

        FilmEntity filmEntity = new FilmEntity();
        filmEntity.setFilmId(new Random().nextLong());
        filmEntity.setTitle("Batman");
        filmEntity.setPrix(25);
        filmEntity.setStock(5);

        return filmEntity;
    }

    @Test
    void testCRUDFilm() throws IOException {

        assertNotNull(filmService);
//  count() expects "long"
        long nombreFilm = filmDao.count();

//  Create
//      Initialisation
        FilmEntity filmEntity = initialisationFilmEntity();
//      Creation
        FilmEntity filmCreated = filmService.createFilm(filmEntity);


//        TODO: le save et vérif q la lecture depuis la base
        assertNotNull(filmCreated);
        assertNotNull(filmCreated.getFilmId());
        assertEquals("Batman", filmCreated.getTitle());
        assertEquals(25, filmCreated.getPrix());
        assertEquals(5, filmCreated.getStock());

        assertEquals(nombreFilm + 1, filmDao.count());

//  Read
//      Read 1 film
//        Optional<FilmEntity> filmById = filmService.getFilmById(filmEntity.getFilmId());
//        assertNotNull(filmById);
//        assertNotNull(filmById.getFilmId());  TODO: not working!?!
//        assertEquals();




    }
}
