package com.simplon.filmothequeapplication.service;

import com.simplon.filmothequeapplication.storage.entity.CommandeEntity;

import java.io.IOException;
import java.util.List;
import java.util.Optional;

public interface CommandeService {

    CommandeEntity createCommande(CommandeEntity commandeEntity);

    List<CommandeEntity> getAllCommandes() throws IOException;

    Optional<CommandeEntity> getCommandeById(Long id) throws IOException;

    CommandeEntity updateCommande(CommandeEntity commandeEntity);

    void deleteCommande(Long id);
}
