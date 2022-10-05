package com.barberiamisiontic.barberia.service;


import java.util.List;

import org.springframework.stereotype.Service;

import com.barberiamisiontic.barberia.domain.Empleado;
import com.barberiamisiontic.barberia.repository.IEmpleadoRepository;

@Service
public class EmpleadoService implements IEmpleadoService{
    
    private IEmpleadoRepository empleadoeRepository;

    public EmpleadoService(IEmpleadoRepository empleadoeRepository){
        this.empleadoeRepository = empleadoeRepository;
    }

    @Override
    public  List<Empleado> getAllClientes(){
        return empleadoeRepository.findAll();
    }
    @Override
    public Empleado saveEmpleado(Empleado empleado){
        return empleadoeRepository.save(empleado);
    }

    @Override
    public Empleado getEmpleadoById(long id){
        return empleadoeRepository.getReferenceById(id);
    }

    @Override
    public Empleado updateEmpleado(Empleado empleado){
        return empleadoeRepository.save(empleado);
    }

    @Override
    public void deleteEmpleado(long id){
        empleadoeRepository.deleteById(id);
    }
    
}
