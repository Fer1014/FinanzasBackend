package edu.pe.upc.finanzas.finanzasbackend.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Table(name = "DetalleBono")
public class DetalleBono implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long detalleBonoId;

    @Column(name = "fecha_programada")
    private LocalDate fechaProgramada;
    @Column(name = "inflacion_tipo", precision = 5, scale = 3)
    private BigDecimal inflacionTipo;
    @Column(name = "bono_valor")
    private Double bonoValor;
    @Column(name = "bono_indexado")
    private Double bonoIndexado;
    @Column(name = "cupon_interes")
    private Double cuponInteres;
    @Column(name = "cuota")
    private Double cuota;
    @Column(name = "amortizacion")
    private Double amortizacion;
    @Column(name = "prima")
    private Double prima;
    @Column(name = "escudo")
    private Double escudo;
    @Column(name = "flujo_emisor")
    private Double flujoEmisor;
    @Column(name = "flujo_emisor_escudo")
    private Double flujoEmisorEscudo;
    @Column(name = "flujo_bonista")
    private Double flujoBonista;
    @Column(name = "flujo_actual")
    private Double flujoActual;
    @Column(name = "flujo_act_plazo")
    private Double flujoActPlazo;
    @Column(name = "factor_convexidad")
    private Double factorConvexidad;

    @JsonIgnore
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "bono_id", nullable = false)
    private Bono bono;

    public DetalleBono() {
    }

    public DetalleBono(Long detalleBonoId, LocalDate fechaProgramada, BigDecimal inflacionTipo, Double bonoValor, Double bonoIndexado, Double cuponInteres, Double cuota, Double amortizacion, Double prima, Double escudo, Double flujoEmisor, Double flujoEmisorEscudo, Double flujoBonista, Double flujoActual, Double flujoActPlazo, Double factorConvexidad, Bono bono) {
        this.detalleBonoId = detalleBonoId;
        this.fechaProgramada = fechaProgramada;
        this.inflacionTipo = inflacionTipo;
        this.bonoValor = bonoValor;
        this.bonoIndexado = bonoIndexado;
        this.cuponInteres = cuponInteres;
        this.cuota = cuota;
        this.amortizacion = amortizacion;
        this.prima = prima;
        this.escudo = escudo;
        this.flujoEmisor = flujoEmisor;
        this.flujoEmisorEscudo = flujoEmisorEscudo;
        this.flujoBonista = flujoBonista;
        this.flujoActual = flujoActual;
        this.flujoActPlazo = flujoActPlazo;
        this.factorConvexidad = factorConvexidad;
        this.bono = bono;
    }

    public Long getDetalleBonoId() {
        return detalleBonoId;
    }

    public void setDetalleBonoId(Long detalleBonoId) {
        this.detalleBonoId = detalleBonoId;
    }

    public LocalDate getFechaProgramada() {
        return fechaProgramada;
    }

    public void setFechaProgramada(LocalDate fechaProgramada) {
        this.fechaProgramada = fechaProgramada;
    }

    public BigDecimal getInflacionTipo() {
        return inflacionTipo;
    }

    public void setInflacionTipo(BigDecimal inflacionTipo) {
        this.inflacionTipo = inflacionTipo;
    }

    public Double getBonoValor() {
        return bonoValor;
    }

    public void setBonoValor(Double bonoValor) {
        this.bonoValor = bonoValor;
    }

    public Double getBonoIndexado() {
        return bonoIndexado;
    }

    public void setBonoIndexado(Double bonoIndexado) {
        this.bonoIndexado = bonoIndexado;
    }

    public Double getCuponInteres() {
        return cuponInteres;
    }

    public void setCuponInteres(Double cuponInteres) {
        this.cuponInteres = cuponInteres;
    }

    public Double getCuota() {
        return cuota;
    }

    public void setCuota(Double cuota) {
        this.cuota = cuota;
    }

    public Double getAmortizacion() {
        return amortizacion;
    }

    public void setAmortizacion(Double amortizacion) {
        this.amortizacion = amortizacion;
    }

    public Double getPrima() {
        return prima;
    }

    public void setPrima(Double prima) {
        this.prima = prima;
    }

    public Double getEscudo() {
        return escudo;
    }

    public void setEscudo(Double escudo) {
        this.escudo = escudo;
    }

    public Double getFlujoEmisor() {
        return flujoEmisor;
    }

    public void setFlujoEmisor(Double flujoEmisor) {
        this.flujoEmisor = flujoEmisor;
    }

    public Double getFlujoEmisorEscudo() {
        return flujoEmisorEscudo;
    }

    public void setFlujoEmisorEscudo(Double flujoEmisorEscudo) {
        this.flujoEmisorEscudo = flujoEmisorEscudo;
    }

    public Double getFlujoBonista() {
        return flujoBonista;
    }

    public void setFlujoBonista(Double flujoBonista) {
        this.flujoBonista = flujoBonista;
    }

    public Double getFlujoActual() {
        return flujoActual;
    }

    public void setFlujoActual(Double flujoActual) {
        this.flujoActual = flujoActual;
    }

    public Double getFlujoActPlazo() {
        return flujoActPlazo;
    }

    public void setFlujoActPlazo(Double flujoActPlazo) {
        this.flujoActPlazo = flujoActPlazo;
    }

    public Double getFactorConvexidad() {
        return factorConvexidad;
    }

    public void setFactorConvexidad(Double factorConvexidad) {
        this.factorConvexidad = factorConvexidad;
    }

    public Bono getBono() {
        return bono;
    }

    public void setBono(Bono bono) {
        this.bono = bono;
    }
}
