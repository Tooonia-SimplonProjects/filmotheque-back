package com.simplon.filmothequeapplication.service.impl;

import com.simplon.filmothequeapplication.service.ClientService;
import com.simplon.filmothequeapplication.storage.entity.ClientEntity;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.List;
import java.util.Optional;

@Service
public class ClientServiceImpl implements ClientService {

    @Override
    public ClientEntity createClient(ClientEntity clientEntity) {
        return null;
    }

    @Override
    public List<ClientEntity> getAllClients() throws IOException {
        return null;
    }

    @Override
    public Optional<ClientEntity> getClientById(Long id) throws IOException {
        return null;
    }

    @Override
    public ClientEntity updateClient(ClientEntity clientEntity) {
        return null;
    }

    @Override
    public void deleteClient(Long id) {

    }
}
