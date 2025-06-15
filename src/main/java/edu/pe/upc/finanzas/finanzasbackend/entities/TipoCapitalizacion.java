package edu.pe.upc.finanzas.finanzasbackend.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.io.Serializable;
import java.util.List;

@Entity
@Table(name ="Tipo_capitalizacion")
public class TipoCapitalizacion implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long capId;

    @Column(name = "descripcion", length = 50)
    private String descripcion;

    @JsonIgnore
    @OneToMany(mappedBy = "tipoCapitalizacion", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Bono> bonos;

    public TipoCapitalizacion() {}

    public TipoCapitalizacion(Long capId, String descripcion, List<Bono> bonos) {
        this.capId = capId;
        this.descripcion = descripcion;
        this.bonos = bonos;
    }

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

    public List<Bono> getBonos() {
        return bonos;
    }

    public void setBonos(List<Bono> bonos) {
        this.bonos = bonos;
    }
}
