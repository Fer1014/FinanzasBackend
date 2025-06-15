package edu.pe.upc.finanzas.finanzasbackend.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "DiasAnio")
public class DiasAnio implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long diasAnioId;

    @Column(name = "dias")
    private Integer dias;

    @JsonIgnore
    @OneToMany(mappedBy = "diasAnio", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Bono> bonos;

    public DiasAnio() {}

    public DiasAnio(Long diasAnioId, Integer dias, List<Bono> bonos) {
        this.diasAnioId = diasAnioId;
        this.dias = dias;
        this.bonos = bonos;
    }

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

    public List<Bono> getBonos() {
        return bonos;
    }

    public void setBonos(List<Bono> bonos) {
        this.bonos = bonos;
    }
}
