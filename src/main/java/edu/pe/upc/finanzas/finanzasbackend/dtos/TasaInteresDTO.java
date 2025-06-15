package edu.pe.upc.finanzas.finanzasbackend.dtos;

public class TasaInteresDTO {
    private Long tasaInteresId;
    private String descripcion;

    public Long getTasaInteresId() {
        return tasaInteresId;
    }

    public void setTasaInteresId(Long tasaInteresId) {
        this.tasaInteresId = tasaInteresId;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
