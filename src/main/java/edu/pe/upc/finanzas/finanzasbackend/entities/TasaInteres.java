package edu.pe.upc.finanzas.finanzasbackend.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "TasaInteres")
public class TasaInteres implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long tasaInteresId;

    @Column(name = "descripcion")
    private String descripcion;

    @JsonIgnore
    @OneToMany(mappedBy = "tasaInteres", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Bono> bonos;

    public TasaInteres() {}

    public TasaInteres(Long tasaInteresId, String descripcion, List<Bono> bonos) {
        this.tasaInteresId = tasaInteresId;
        this.descripcion = descripcion;
        this.bonos = bonos;
    }

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

    public List<Bono> getBonos() {
        return bonos;
    }

    public void setBonos(List<Bono> bonos) {
        this.bonos = bonos;
    }
}