package com.g31.jpa.service;

import com.g31.jpa.entity.Client;
import com.g31.jpa.repository.ClientRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author desaextremo
 */
@Service
public class ClientService {

    @Autowired
    private ClientRepository clientRepository;

    //Metodo para consultar todos los registros (Capa de servicios)
    public List<Client> getClient() {
        return clientRepository.findAll();
    }

    //Metodo para insertar (Capa de servicios)
    public Client insertClient(Client client) {
        return clientRepository.save(client);
    }
}
