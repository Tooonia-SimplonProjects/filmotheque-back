package com.simplon.filmothequeapplication.service.impl;

import com.simplon.filmothequeapplication.service.DroitUtilisateurService;
import com.simplon.filmothequeapplication.storage.entity.DroitUtilisateurEntity;

import java.io.IOException;
import java.util.List;
import java.util.Optional;

public class DroitUtilisateurServiceImpl implements DroitUtilisateurService {
    @Override
    public DroitUtilisateurEntity createDroitUtilisateur(DroitUtilisateurEntity droitUtilisateurEntity) {
        return null;
    }

    @Override
    public List<DroitUtilisateurEntity> getAllDroitUtilisateur() throws IOException {
        return null;
    }

    @Override
    public Optional<DroitUtilisateurEntity> getDroitUtilisateurById(Long id) throws IOException {
        return Optional.empty();
    }

    @Override
    public DroitUtilisateurEntity updateDroitUtilisateur(DroitUtilisateurEntity droitUtilisateurEntity) {
        return null;
    }

    @Override
    public void deleteDroitUtilisateur(Long id) {

    }
}
