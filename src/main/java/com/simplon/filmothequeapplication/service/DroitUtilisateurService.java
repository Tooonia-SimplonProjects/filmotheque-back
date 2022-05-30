package com.simplon.filmothequeapplication.service;

import com.simplon.filmothequeapplication.storage.entity.DroitUtilisateurEntity;

import java.io.IOException;
import java.util.List;
import java.util.Optional;

public interface DroitUtilisateurService {

    DroitUtilisateurEntity createDroitUtilisateur(DroitUtilisateurEntity droitUtilisateurEntity);

    List<DroitUtilisateurEntity> getAllDroitUtilisateur() throws IOException;

    Optional<DroitUtilisateurEntity> getDroitUtilisateurById(Long id) throws IOException;

    DroitUtilisateurEntity updateDroitUtilisateur(DroitUtilisateurEntity droitUtilisateurEntity);

    void deleteDroitUtilisateur(Long id);
}
