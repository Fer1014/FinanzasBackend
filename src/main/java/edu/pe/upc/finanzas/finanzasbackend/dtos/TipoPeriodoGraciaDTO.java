package edu.pe.upc.finanzas.finanzasbackend.dtos;

public class TipoPeriodoGraciaDTO {
    private Long graciaId;
    private String descripcion;

    public Long getGraciaId() {
        return graciaId;
    }

    public void setGraciaId(Long graciaId) {
        this.graciaId = graciaId;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
