package edu.pe.upc.finanzas.finanzasbackend.dtos;

import jakarta.persistence.Column;

public class MonedaDTO {
    private String descripcion;

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
