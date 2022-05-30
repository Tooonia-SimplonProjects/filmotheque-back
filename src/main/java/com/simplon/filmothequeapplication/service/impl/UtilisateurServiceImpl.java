package com.simplon.filmothequeapplication.service.impl;

import com.simplon.filmothequeapplication.service.UtilisateurService;
import com.simplon.filmothequeapplication.storage.entity.UtilisateurEntity;

import java.io.IOException;
import java.util.List;
import java.util.Optional;

public class UtilisateurServiceImpl implements UtilisateurService {
    @Override
    public UtilisateurEntity createUtilisateur(UtilisateurEntity utilisateurEntity) {
        return null;
    }

    @Override
    public List<UtilisateurEntity> getAllUtilisateurs() throws IOException {
        return null;
    }

    @Override
    public Optional<UtilisateurEntity> getUtilisateurById(Long id) throws IOException {
        return Optional.empty();
    }

    @Override
    public UtilisateurEntity updateUtilisateur(UtilisateurEntity utilisateurEntity) {
        return null;
    }

    @Override
    public void deleteUtilisateur(Long id) {

    }
}
