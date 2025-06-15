package edu.pe.upc.finanzas.finanzasbackend.dtos;

import java.math.BigDecimal;

public class ResultadosCalculosDTO {
    private Long frecuenciaCuponNum;
    private Long diasCap;
    private Long numPeriodoAnio;
    private Long numTotalPeriodo;
    private BigDecimal tasaEfeAnual;
    private BigDecimal cokTipo;
    private Double costesInicialesEmisor;
    private Double costesInicialesBonista;

    public Long getFrecuenciaCuponNum() {
        return frecuenciaCuponNum;
    }

    public void setFrecuenciaCuponNum(Long frecuenciaCuponNum) {
        this.frecuenciaCuponNum = frecuenciaCuponNum;
    }

    public Long getDiasCap() {
        return diasCap;
    }

    public void setDiasCap(Long diasCap) {
        this.diasCap = diasCap;
    }

    public Long getNumPeriodoAnio() {
        return numPeriodoAnio;
    }

    public void setNumPeriodoAnio(Long numPeriodoAnio) {
        this.numPeriodoAnio = numPeriodoAnio;
    }

    public Long getNumTotalPeriodo() {
        return numTotalPeriodo;
    }

    public void setNumTotalPeriodo(Long numTotalPeriodo) {
        this.numTotalPeriodo = numTotalPeriodo;
    }

    public BigDecimal getTasaEfeAnual() {
        return tasaEfeAnual;
    }

    public void setTasaEfeAnual(BigDecimal tasaEfeAnual) {
        this.tasaEfeAnual = tasaEfeAnual;
    }

    public BigDecimal getCokTipo() {
        return cokTipo;
    }

    public void setCokTipo(BigDecimal cokTipo) {
        this.cokTipo = cokTipo;
    }

    public Double getCostesInicialesEmisor() {
        return costesInicialesEmisor;
    }

    public void setCostesInicialesEmisor(Double costesInicialesEmisor) {
        this.costesInicialesEmisor = costesInicialesEmisor;
    }

    public Double getCostesInicialesBonista() {
        return costesInicialesBonista;
    }

    public void setCostesInicialesBonista(Double costesInicialesBonista) {
        this.costesInicialesBonista = costesInicialesBonista;
    }

}
