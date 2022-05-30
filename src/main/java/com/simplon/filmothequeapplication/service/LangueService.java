package com.simplon.filmothequeapplication.service;

import com.simplon.filmothequeapplication.storage.entity.LangueEntity;

import javax.swing.text.html.Option;
import java.io.IOException;
import java.util.List;
import java.util.Optional;

public interface LangueService {

    LangueEntity createLangue(LangueEntity langueEntity);

    List<LangueEntity> getAllLangues() throws IOException;

    Optional<LangueEntity> getLangueById(Long id) throws IOException;

    LangueEntity updateLangue(LangueEntity langueEntity);

    void deleteLangue(Long id);
}
