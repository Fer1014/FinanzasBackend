package edu.pe.upc.finanzas.finanzasbackend.dtos;

import jakarta.persistence.Column;

import java.math.BigDecimal;
import java.time.LocalDate;

public class BonoDTO {
    private Long bonoId;
    private Double valorNominal;
    private Double valorComercial;
    private Long numAnios;
    private BigDecimal tasaInteresPorc;
    private BigDecimal tasaAnualDesc;
    private Long impRenta;
    private LocalDate fechaEmision;
    private BigDecimal porcEstructuracion;
    private BigDecimal porcColocacion;
    private BigDecimal porcFlotacion;
    private BigDecimal porcCavali;
    private BigDecimal inflacionAnual;

    public Long getBonoId() {
        return bonoId;
    }

    public void setBonoId(Long bonoId) {
        this.bonoId = bonoId;
    }

    public Double getValorNominal() {
        return valorNominal;
    }

    public void setValorNominal(Double valorNominal) {
        this.valorNominal = valorNominal;
    }

    public Double getValorComercial() {
        return valorComercial;
    }

    public void setValorComercial(Double valorComercial) {
        this.valorComercial = valorComercial;
    }

    public Long getNumAnios() {
        return numAnios;
    }

    public void setNumAnios(Long numAnios) {
        this.numAnios = numAnios;
    }

    public BigDecimal getTasaInteresPorc() {
        return tasaInteresPorc;
    }

    public void setTasaInteresPorc(BigDecimal tasaInteresPorc) {
        this.tasaInteresPorc = tasaInteresPorc;
    }

    public BigDecimal getTasaAnualDesc() {
        return tasaAnualDesc;
    }

    public void setTasaAnualDesc(BigDecimal tasaAnualDesc) {
        this.tasaAnualDesc = tasaAnualDesc;
    }

    public Long getImpRenta() {
        return impRenta;
    }

    public void setImpRenta(Long impRenta) {
        this.impRenta = impRenta;
    }

    public LocalDate getFechaEmision() {
        return fechaEmision;
    }

    public void setFechaEmision(LocalDate fechaEmision) {
        this.fechaEmision = fechaEmision;
    }

    public BigDecimal getPorcEstructuracion() {
        return porcEstructuracion;
    }

    public void setPorcEstructuracion(BigDecimal porcEstructuracion) {
        this.porcEstructuracion = porcEstructuracion;
    }

    public BigDecimal getPorcColocacion() {
        return porcColocacion;
    }

    public void setPorcColocacion(BigDecimal porcColocacion) {
        this.porcColocacion = porcColocacion;
    }

    public BigDecimal getPorcFlotacion() {
        return porcFlotacion;
    }

    public void setPorcFlotacion(BigDecimal porcFlotacion) {
        this.porcFlotacion = porcFlotacion;
    }

    public BigDecimal getPorcCavali() {
        return porcCavali;
    }

    public void setPorcCavali(BigDecimal porcCavali) {
        this.porcCavali = porcCavali;
    }

    public BigDecimal getInflacionAnual() {
        return inflacionAnual;
    }

    public void setInflacionAnual(BigDecimal inflacionAnual) {
        this.inflacionAnual = inflacionAnual;
    }
}
