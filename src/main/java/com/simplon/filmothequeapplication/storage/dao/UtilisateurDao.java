package com.simplon.filmothequeapplication.storage.dao;

import com.simplon.filmothequeapplication.storage.entity.UtilisateurEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UtilisateurDao extends JpaRepository<UtilisateurEntity, Long> {
}
