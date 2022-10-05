package com.barberiamisiontic.barberia.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.barberiamisiontic.barberia.domain.Reserva;

public interface IReservaRepository extends JpaRepository<Reserva, Long>{
    
    @Query("FROM Reserva r WHERE r.id_reserva == :3")
    List<Reserva> findByTitleContaining(@Param("id_reserva")int id_reserva);

    @Query("FROM Reserva r WHERE r.id_empleado != : 1")
    List<Reserva> findByFeeLessThan(@Param("id_empleado") int id_empleado);    

    @Query("FROM Reserva r ORDER BY id_empleado ASC")
    public List<Reserva> findAllSortByName();
}
