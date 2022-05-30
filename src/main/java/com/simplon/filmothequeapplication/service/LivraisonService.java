package com.simplon.filmothequeapplication.service;

import com.simplon.filmothequeapplication.storage.entity.LivraisonEntity;

import java.io.IOException;
import java.util.List;
import java.util.Optional;

public interface LivraisonService {

    LivraisonEntity createLivraison(LivraisonEntity livraisonEntity);

    List<LivraisonEntity> getAllLivraisons() throws IOException;

    Optional<LivraisonEntity> getLivraisonById(Long id) throws IOException;

    LivraisonEntity updateLivraison(LivraisonEntity livraisonEntity);

    void deleteLivraison(Long id);
}
