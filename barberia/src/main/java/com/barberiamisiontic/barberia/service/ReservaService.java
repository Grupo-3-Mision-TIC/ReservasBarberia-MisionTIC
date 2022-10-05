package com.barberiamisiontic.barberia.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.barberiamisiontic.barberia.domain.Reserva;
import com.barberiamisiontic.barberia.repository.IReservaRepository;

@Service
public class ReservaService implements IReservaService {
    
    private IReservaRepository reservaRepository;

    public ReservaService(IReservaRepository reservaRepository){
        this.reservaRepository = reservaRepository;
    }

    @Override
    public List<Reserva> getAllReservas(){
        return reservaRepository.findAll();
    }
    @Override
    public Reserva saveReserva(Reserva reserva){
        return reservaRepository.save(reserva);
    }

    @Override
    public Reserva getReservaById(long id){
        return reservaRepository.getReferenceById(id);
    }

    @Override
    public Reserva updateReserva(Reserva reserva){
        return reservaRepository.save(reserva);
    }

    @Override
    public void deleteReserva(long id){
        reservaRepository.deleteById(id);
    }
}
