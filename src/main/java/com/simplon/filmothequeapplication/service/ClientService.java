package com.simplon.filmothequeapplication.service;

import com.simplon.filmothequeapplication.storage.entity.ClientEntity;

import java.io.IOException;
import java.util.List;
import java.util.Optional;

public interface ClientService {

    ClientEntity createClient(ClientEntity clientEntity);

    List<ClientEntity> getAllClients() throws IOException;;

    Optional<ClientEntity> getClientById(Long id) throws IOException;

    ClientEntity updateClient(ClientEntity clientEntity);

    void deleteClient(Long id);


}
