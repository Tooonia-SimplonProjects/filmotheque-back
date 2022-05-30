package com.simplon.filmothequeapplication.storage.dao;

import com.simplon.filmothequeapplication.storage.entity.DetailCommandeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DetailCommandeDao extends JpaRepository<DetailCommandeEntity, Long> {
}
