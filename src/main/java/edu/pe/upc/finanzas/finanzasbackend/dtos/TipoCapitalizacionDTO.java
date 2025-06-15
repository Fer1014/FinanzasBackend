package edu.pe.upc.finanzas.finanzasbackend.dtos;

public class TipoCapitalizacionDTO {
    private Long capId;
    private String descripcion;

    public Long getCapId() {
        return capId;
    }

    public void setCapId(Long capId) {
        this.capId = capId;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
