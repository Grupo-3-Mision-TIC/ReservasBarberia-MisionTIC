package com.barberiamisiontic.barberia.service;

import java.util.List;

import com.barberiamisiontic.barberia.domain.Reserva;

public interface IReservaService {
    
    List<Reserva> getAllReservas();

    Reserva saveReserva(Reserva reserva);

    Reserva getReservaById(long id);

    Reserva updateReserva(Reserva reserva);

    void deleteReserva(long id);
}
