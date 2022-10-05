package com.barberiamisiontic.barberia.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.barberiamisiontic.barberia.domain.Cliente;

public interface IClienteRepository extends JpaRepository<Cliente, Long> {
    
    @Query("FROM Cliente c WHERE c.nombre_apellidos LIKE : name")
    public List<Cliente> findByNameContaining(@Param("name")String name);

    Cliente update(Cliente cliente);
    
}
