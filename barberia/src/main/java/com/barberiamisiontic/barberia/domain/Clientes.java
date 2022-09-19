package com.barberiamisiontic.barberia.domain;

public class Clientes {

    private int id_cliente;
    private String nombre_apellidos;
    private boolean estado;

    public int getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(int id_cliente) {
        this.id_cliente = id_cliente;
    }

    public String getNombre_apellidos() {
        return nombre_apellidos;
    }

    public void setNombre_apellidos(String nombre_apellidos) {
        this.nombre_apellidos = nombre_apellidos;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

}
