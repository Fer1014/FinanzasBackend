package edu.pe.upc.finanzas.finanzasbackend.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "Aplicante")
public class Aplicante implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long aplicanteId;

    @Column(name = "descripcion", length = 50)
    private String descripcion;

    @JsonIgnore
    @OneToMany(mappedBy = "aplicante", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Bono> bonos;

    public Aplicante() {}

    public Aplicante(Long aplicanteId, String descripcion, List<Bono> bonos) {
        this.aplicanteId = aplicanteId;
        this.descripcion = descripcion;
        this.bonos = bonos;
    }

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

    public List<Bono> getBonos() {
        return bonos;
    }

    public void setBonos(List<Bono> bonos) {
        this.bonos = bonos;
    }
}
