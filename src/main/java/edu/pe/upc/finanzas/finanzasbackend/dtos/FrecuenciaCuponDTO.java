package edu.pe.upc.finanzas.finanzasbackend.dtos;

import jakarta.persistence.Column;

public class FrecuenciaCuponDTO {
    private Long frecuenciaCuponId;
    private String descripcion;

    public Long getFrecuenciaCuponId() {
        return frecuenciaCuponId;
    }

    public void setFrecuenciaCuponId(Long frecuenciaCuponId) {
        this.frecuenciaCuponId = frecuenciaCuponId;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
