package com.simplon.filmothequeapplication.service.impl;

import com.simplon.filmothequeapplication.service.LivraisonService;
import com.simplon.filmothequeapplication.storage.entity.LivraisonEntity;

import java.io.IOException;
import java.util.List;
import java.util.Optional;

public class LivraisonServiceImpl implements LivraisonService {
    @Override
    public LivraisonEntity createLivraison(LivraisonEntity livraisonEntity) {
        return null;
    }

    @Override
    public List<LivraisonEntity> getAllLivraisons() throws IOException {
        return null;
    }

    @Override
    public Optional<LivraisonEntity> getLivraisonById(Long id) throws IOException {
        return Optional.empty();
    }

    @Override
    public LivraisonEntity updateLivraison(LivraisonEntity livraisonEntity) {
        return null;
    }

    @Override
    public void deleteLivraison(Long id) {

    }
}
