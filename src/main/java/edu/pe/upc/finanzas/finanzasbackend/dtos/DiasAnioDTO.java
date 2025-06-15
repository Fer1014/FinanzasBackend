package edu.pe.upc.finanzas.finanzasbackend.dtos;

public class DiasAnioDTO {
    private Long diasAnioId;
    private Integer dias;

    // Constructor
    public DiasAnioDTO() {}

    // Getters y Setters
    public Long getDiasAnioId() {
        return diasAnioId;
    }

    public void setDiasAnioId(Long diasAnioId) {
        this.diasAnioId = diasAnioId;
    }

    public Integer getDias() {
        return dias;
    }

    public void setDias(Integer dias) {
        this.dias = dias;
    }
}
