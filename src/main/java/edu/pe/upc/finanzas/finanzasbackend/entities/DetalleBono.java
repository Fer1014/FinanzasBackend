package edu.pe.upc.finanzas.finanzasbackend.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;

@Data
@Entity
@Table(name = "DetalleBono")
public class DetalleBono implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long detalleBonoId;

    @Column(name = "periodo")
    private Long periodo;
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

    public DetalleBono(Long detalleBonoId, Long periodo,LocalDate fechaProgramada, BigDecimal inflacionTipo, Double bonoValor, Double bonoIndexado, Double cuponInteres, Double cuota, Double amortizacion, Double prima, Double escudo, Double flujoEmisor, Double flujoEmisorEscudo, Double flujoBonista, Double flujoActual, Double flujoActPlazo, Double factorConvexidad, Bono bono) {
        this.periodo = periodo;
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
}
