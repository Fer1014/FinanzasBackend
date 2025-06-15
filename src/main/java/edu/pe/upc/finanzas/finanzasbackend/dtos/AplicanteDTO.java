package edu.pe.upc.finanzas.finanzasbackend.dtos;

public class AplicanteDTO {
    private Long aplicanteId;
    private String descripcion;

    public Long getAplicanteId() {
        return aplicanteId;
    }

    public void setAplicanteId(Long aplicanteId) {
        this.aplicanteId = aplicanteId;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
