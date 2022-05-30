package com.simplon.filmothequeapplication.service.impl;

import com.simplon.filmothequeapplication.service.DetailCommandeService;
import com.simplon.filmothequeapplication.storage.entity.DetailCommandeEntity;

import java.io.IOException;
import java.util.List;
import java.util.Optional;

public class DetailCommandeServiceImpl implements DetailCommandeService {
    @Override
    public DetailCommandeEntity createDetailCommande(DetailCommandeEntity detailCommandeEntity) {
        return null;
    }

    @Override
    public List<DetailCommandeEntity> getAllDetailCommandes() throws IOException {
        return null;
    }

    @Override
    public Optional<DetailCommandeEntity> getDetailCommandeById(Long id) throws IOException {
        return Optional.empty();
    }

    @Override
    public DetailCommandeEntity updateDetailCommande(DetailCommandeEntity detailCommandeEntity) {
        return null;
    }

    @Override
    public void deleteDetailCommande(Long id) {

    }
}
