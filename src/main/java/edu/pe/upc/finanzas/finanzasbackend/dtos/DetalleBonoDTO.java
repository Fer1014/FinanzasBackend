package edu.pe.upc.finanzas.finanzasbackend.dtos;

import java.math.BigDecimal;
import java.time.LocalDate;

public class DetalleBonoDTO {
    private Long detalleBonoId;
    private LocalDate fechaProgramada;
    private BigDecimal inflacionTipo;
    private Double bonoValor;
    private Double bonoIndexado;
    private Double cuponInteres;
    private Double cuota;
    private Double amortizacion;
    private Double prima;
    private Double escudo;
    private Double flujoEmisor;
    private Double flujoEmisorEscudo;
    private Double flujoBonista;
    private Double flujoActual;
    private Double flujoActPlazo;
    private Double factorConvexidad;

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

}
