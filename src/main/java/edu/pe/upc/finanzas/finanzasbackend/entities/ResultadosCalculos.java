package edu.pe.upc.finanzas.finanzasbackend.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;

@Entity
@Table(name = "ResultadosCalculos")
public class ResultadosCalculos implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long bonoId;

    @Column(name = "frecuencia_cupon_num")
    private Long frecuenciaCuponNum;
    @Column(name = "dias_cap")
    private Long diasCap;
    @Column(name = "num_periodo_anio")
    private Long numPeriodoAnio;
    @Column(name = "num_total_periodo")
    private Long numTotalPeriodo;
    @Column(name = "tasa_efe_anual", precision = 5, scale = 3)
    private BigDecimal tasaEfeAnual;
    @Column(name = "cok_tipo", precision = 5, scale = 3)
    private BigDecimal cokTipo;
    @Column(name = "costes_iniciales_emisor")
    private Double costesInicialesEmisor;
    @Column(name = "costes_iniciales_bonista")
    private Double costesInicialesBonista;

    @JsonIgnore
    @OneToOne(fetch = FetchType.LAZY)
    @MapsId
    @JoinColumn(name = "bono_id")
    private Bono bono;

    public ResultadosCalculos() {}

    public ResultadosCalculos(Long frecuenciaCuponNum, Long diasCap, Long numPeriodoAnio, Long numTotalPeriodo, BigDecimal tasaEfeAnual, BigDecimal cokTipo, Double costesInicialesEmisor, Double costesInicialesBonista) {
        this.frecuenciaCuponNum = frecuenciaCuponNum;
        this.diasCap = diasCap;
        this.numPeriodoAnio = numPeriodoAnio;
        this.numTotalPeriodo = numTotalPeriodo;
        this.tasaEfeAnual = tasaEfeAnual;
        this.cokTipo = cokTipo;
        this.costesInicialesEmisor = costesInicialesEmisor;
        this.costesInicialesBonista = costesInicialesBonista;
    }

    public Long getBonoId() {
        return bonoId;
    }

    public void setBonoId(Long bonoId) {
        this.bonoId = bonoId;
    }

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

    public Bono getBono() {
        return bono;
    }

    public void setBono(Bono bono) {
        this.bono = bono;
    }
}