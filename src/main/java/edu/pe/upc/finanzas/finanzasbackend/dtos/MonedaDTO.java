package edu.pe.upc.finanzas.finanzasbackend.dtos;

import jakarta.persistence.Column;

public class MonedaDTO {
    private Long monedaId;
    private String descripcion;

    public Long getMonedaId() {
        return monedaId;
    }

    public void setMonedaId(Long monedaId) {
        this.monedaId = monedaId;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
