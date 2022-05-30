package com.simplon.filmothequeapplication.service.impl;

import com.simplon.filmothequeapplication.service.LangueService;
import com.simplon.filmothequeapplication.storage.entity.LangueEntity;

import java.io.IOException;
import java.util.List;
import java.util.Optional;

public class LangueServiceImpl implements LangueService {
    @Override
    public LangueEntity createLangue(LangueEntity langueEntity) {
        return null;
    }

    @Override
    public List<LangueEntity> getAllLangues() throws IOException {
        return null;
    }

    @Override
    public Optional<LangueEntity> getLangueById(Long id) throws IOException {
        return Optional.empty();
    }

    @Override
    public LangueEntity updateLangue(LangueEntity langueEntity) {
        return null;
    }

    @Override
    public void deleteLangue(Long id) {

    }
}
