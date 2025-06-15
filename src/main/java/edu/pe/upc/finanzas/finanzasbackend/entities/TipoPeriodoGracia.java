package edu.pe.upc.finanzas.finanzasbackend.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "TipoPeriodoGracia")
public class TipoPeriodoGracia implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long graciaId;

    @Column(name = "descripcion", length = 50)
    private String descripcion;

    @JsonIgnore
    @OneToMany(mappedBy = "tipoPeriodoGracia", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Bono> bonos;

    public TipoPeriodoGracia() {}

    public TipoPeriodoGracia(Long graciaId, String descripcion, List<Bono> bonos) {
        this.graciaId = graciaId;
        this.descripcion = descripcion;
        this.bonos = bonos;
    }

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

    public List<Bono> getBonos() {
        return bonos;
    }

    public void setBonos(List<Bono> bonos) {
        this.bonos = bonos;
    }
}
