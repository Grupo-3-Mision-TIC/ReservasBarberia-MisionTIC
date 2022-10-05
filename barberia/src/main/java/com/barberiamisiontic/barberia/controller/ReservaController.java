package com.barberiamisiontic.barberia.controller;

//import java.util.ArrayList;
//import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


//import com.barberiamisiontic.barberia.domain.Cliente;
//import com.barberiamisiontic.barberia.domain.Empleado;

import com.barberiamisiontic.barberia.repository.IClienteRepository;
import com.barberiamisiontic.barberia.repository.IEmpleadoRepository;
import com.barberiamisiontic.barberia.service.ReservaService;

@Controller
public class ReservaController {

    @Autowired
    private ReservaService reservaService;
    @Autowired
    private IClienteRepository clienteRepository;
    @Autowired
    private IEmpleadoRepository empleadoRepository;

    //private List<Cliente> listaClientes = new ArrayList<>();
    //private List<Empleado> listaEmpleados = new ArrayList<>();

    public ReservaController(ReservaService reservaService, IClienteRepository clienteRepository,
            IEmpleadoRepository empleadoRepository) {
        this.reservaService = reservaService;
        this.clienteRepository = clienteRepository;
        this.empleadoRepository = empleadoRepository;
        //this.listaClientes = this.clienteRepository.findAll();
        //this.listaEmpleados = this.empleadoRepository.findAll();
    }

    @GetMapping("/reservas")
    public String home(Model model) {
        model.addAttribute("reservas", reservaService.getAllReservas());
        return "reservas";
    }

    @GetMapping("/clientes")
    public String listaReservas(Model model) {
        model.addAttribute("clientes", clienteRepository.findAll());
        return "clientes";
    }

    @GetMapping("/empleados")
    public String listaEmpleados(Model model) {
        model.addAttribute("empleados", empleadoRepository.findAll());
        return "empleados";
    }    
}
