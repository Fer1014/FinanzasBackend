package edu.pe.upc.finanzas.finanzasbackend.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "FrecuenciaCupon")
public class FrecuenciaCupon implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long frecuenciaCuponId;

    @Column(name = "descripcion")
    private String descripcion;

    @JsonIgnore
    @OneToMany(mappedBy = "frecuenciaCupon", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Bono> bonos;

    public FrecuenciaCupon() {}

    public FrecuenciaCupon(Long frecuenciaCuponId, String descripcion, List<Bono> bonos) {
        this.frecuenciaCuponId = frecuenciaCuponId;
        this.descripcion = descripcion;
        this.bonos = bonos;
    }

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

    public List<Bono> getBonos() {
        return bonos;
    }

    public void setBonos(List<Bono> bonos) {
        this.bonos = bonos;
    }
}