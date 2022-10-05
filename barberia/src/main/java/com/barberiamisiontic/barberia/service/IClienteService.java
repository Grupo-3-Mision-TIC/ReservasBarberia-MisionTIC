package com.barberiamisiontic.barberia.service;

import java.util.List;

import com.barberiamisiontic.barberia.domain.Cliente;

public interface IClienteService {
    
    List<Cliente> getAllClientes();

    Cliente saveCliente(Cliente cliente);

    Cliente getClienteById(long id);

    Cliente updateCourse(Cliente cliente);

    void deleteCliente(long id);
}
