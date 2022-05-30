package com.simplon.filmothequeapplication.storage.dao;

import com.simplon.filmothequeapplication.storage.entity.LangueEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LangueDao extends JpaRepository<LangueEntity, Long> {
}
