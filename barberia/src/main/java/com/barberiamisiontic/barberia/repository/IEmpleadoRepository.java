package com.barberiamisiontic.barberia.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.barberiamisiontic.barberia.domain.Empleado;

public interface IEmpleadoRepository extends JpaRepository<Empleado, Long> {

    @Query("FROM Empleado e WHERE c.nombre_apellidos LIKE : title")
    List<Empleado> findByTitleContaining(@Param("Jorge")String Jorge);

    @Query("FROM Empleado e ORDER BY c.nombre_apellidos ASC")
    public List<Empleado> findAllSortByName();

    Empleado update(Empleado course);
    
}
