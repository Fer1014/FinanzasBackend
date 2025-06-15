package edu.pe.upc.finanzas.finanzasbackend.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "Moneda")
public class Moneda implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long monedaId;

    @Column(name = "descripcion", length = 50)
    private String descripcion;

    @JsonIgnore
    @OneToMany(mappedBy = "moneda", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Bono> bonos;

    public Moneda() {
    }

    public Moneda(Long monedaId, String descripcion, List<Bono> bonos) {
        this.monedaId = monedaId;
        this.descripcion = descripcion;
        this.bonos = bonos;
    }

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

    public List<Bono> getBonos() {
        return bonos;
    }

    public void setBonos(List<Bono> bonos) {
        this.bonos = bonos;
    }
}
