package com.barberiamisiontic.barberia.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.barberiamisiontic.barberia.domain.Cliente;
import com.barberiamisiontic.barberia.repository.IClienteRepository;

@Service
public class ClienteService implements IClienteService{
    
    private IClienteRepository clienteRepository;

    public ClienteService(IClienteRepository clienteRepository){
        this.clienteRepository = clienteRepository;
    }

    @Override
    public List<Cliente> getAllClientes(){
        return clienteRepository.findAll();
    }
    @Override
    public Cliente saveCliente(Cliente cliente){
        return clienteRepository.save(cliente);
    }

    @Override
    public Cliente getClienteById(long id){
        return clienteRepository.getReferenceById(id);
    }

    @Override
    public Cliente updateCliente(Cliente cliente){
        return clienteRepository.save(cliente);
    }

    @Override
    public void deleteCliente(long id){
        clienteRepository.deleteById(id);
    }
}
