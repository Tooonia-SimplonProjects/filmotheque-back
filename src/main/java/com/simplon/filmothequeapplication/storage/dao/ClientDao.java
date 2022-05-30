package com.simplon.filmothequeapplication.storage.dao;

import com.simplon.filmothequeapplication.storage.entity.ClientEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientDao extends JpaRepository<ClientEntity, Long> {
}
