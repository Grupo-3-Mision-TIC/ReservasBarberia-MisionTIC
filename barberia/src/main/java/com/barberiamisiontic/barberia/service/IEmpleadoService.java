package com.barberiamisiontic.barberia.service;

import java.util.List;

import com.barberiamisiontic.barberia.domain.Empleado;

public interface IEmpleadoService {   
    
    List<Empleado> getAllClientes();

    Empleado saveEmpleado(Empleado empleado);

    Empleado getEmpleadoById(long id);

    Empleado updateEmpleado(Empleado empleado);

    void deleteEmpleado(long id);
    
}
