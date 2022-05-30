package com.simplon.filmothequeapplication.service;

import com.simplon.filmothequeapplication.storage.entity.UtilisateurEntity;

import java.io.IOException;
import java.util.List;
import java.util.Optional;

public interface UtilisateurService {

    UtilisateurEntity createUtilisateur(UtilisateurEntity utilisateurEntity);

    List<UtilisateurEntity> getAllUtilisateurs() throws IOException;

    Optional<UtilisateurEntity> getUtilisateurById(Long id) throws IOException;

    UtilisateurEntity updateUtilisateur(UtilisateurEntity utilisateurEntity);

    void deleteUtilisateur(Long id);
}
