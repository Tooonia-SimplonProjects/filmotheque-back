package com.simplon.filmothequeapplication.service;

import com.simplon.filmothequeapplication.storage.entity.DetailCommandeEntity;

import java.io.IOException;
import java.util.List;
import java.util.Optional;

public interface DetailCommandeService {

    DetailCommandeEntity createDetailCommande(DetailCommandeEntity detailCommandeEntity);

    List<DetailCommandeEntity> getAllDetailCommandes() throws IOException;

    Optional<DetailCommandeEntity> getDetailCommandeById(Long id) throws IOException;

    DetailCommandeEntity updateDetailCommande(DetailCommandeEntity detailCommandeEntity);

    void deleteDetailCommande(Long id);
}
