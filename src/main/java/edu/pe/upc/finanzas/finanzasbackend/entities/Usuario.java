package edu.pe.upc.finanzas.finanzasbackend.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "Usuario")
public class Usuario implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long usuarioId;

    @Column(name = "nombre", length = 255, nullable = false)
    private String nombre;

    @Column(name = "email", length = 255, unique = true, nullable = false)
    private String email;

    @Column(name = "clave", length = 255, nullable = false)
    private String clave;

    @Column(name = "fecharegistro")
    private LocalDate fechaRegistro;

    @JsonIgnore
    @OneToMany(mappedBy = "usuario", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Bono> bonos;

    public Usuario() {
    }

    public Usuario(Long usuarioId, String nombre, String email, String clave, LocalDate fechaRegistro, List<Bono> bonos) {
        this.usuarioId = usuarioId;
        this.nombre = nombre;
        this.email = email;
        this.clave = clave;
        this.fechaRegistro = fechaRegistro;
        this.bonos = bonos;
    }

    public Long getUsuarioId() {
        return usuarioId;
    }

    public void setUsuarioId(Long usuarioId) {
        this.usuarioId = usuarioId;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public LocalDate getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(LocalDate fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public List<Bono> getBonos() {
        return bonos;
    }

    public void setBonos(List<Bono> bonos) {
        this.bonos = bonos;
    }
}