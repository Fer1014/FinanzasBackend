package edu.pe.upc.finanzas.finanzasbackend.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

@Data
@Entity
@Table(name = "Bono")
public class Bono implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long bonoId;

    @Column(name = "valor_nominal")
    private Double valorNominal;
    @Column(name = "valor_comercial")
    private Double valorComercial;
    @Column(name = "num_anios")
    private Long numAnios;
    @Column(name = "tasa_interes_porc", precision = 5, scale = 3)
    private BigDecimal tasaInteresPorc;
    @Column(name = "tasa_anual_desc", precision = 5, scale = 3)
    private BigDecimal tasaAnualDesc;
    @Column(name = "imp_renta")
    private Long impRenta;
    @Column(name = "fecha_emision")
    private LocalDate fechaEmision;
    @Column(name = "porc_estructuracion", precision = 5, scale = 3)
    private BigDecimal porcEstructuracion;
    @Column(name = "porc_colocacion", precision = 5, scale = 3)
    private BigDecimal porcColocacion;
    @Column(name = "porc_flotacion", precision = 5, scale = 3)
    private BigDecimal porcFlotacion;
    @Column(name = "porc_cavali", precision = 5, scale = 3)
    private BigDecimal porcCavali;
    @Column(name = "inflacion_anual", precision = 5, scale = 3)
    private BigDecimal inflacionAnual;

    //relaciones
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "usuario_id", nullable = false)
    private Usuario usuario;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "moneda_id", nullable = false)
    private Moneda moneda;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "dias_anio_id", nullable = false)
    private DiasAnio diasAnio;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "tipo_capitalizacion_id", nullable = false)
    private TipoCapitalizacion tipoCapitalizacion;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "aplicante_id", nullable = false)
    private Aplicante aplicante;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "frecuencia_cupon_id", nullable = false)
    private FrecuenciaCupon frecuenciaCupon;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "tasa_interes_id", nullable = false)
    private TasaInteres tasaInteres;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "tipo_periodo_gracia_id", nullable = true) // Puede ser nulo
    private TipoPeriodoGracia tipoPeriodoGracia;

    @OneToMany(mappedBy = "bono", cascade = CascadeType.ALL, fetch = FetchType.LAZY, orphanRemoval = true)
    private List<DetalleBono> detallesBono;

    @OneToOne(mappedBy = "bono", cascade = CascadeType.ALL, fetch = FetchType.LAZY, orphanRemoval = true)
    private ResultadosCalculos resultadosCalculos;


    public Bono() {}

    public Bono(Long bonoId, Double valorNominal, Double valorComercial, Long numAnios, BigDecimal tasaInteresPorc, BigDecimal tasaAnualDesc, Long impRenta, LocalDate fechaEmision, BigDecimal porcEstructuracion, BigDecimal porcColocacion, BigDecimal porcFlotacion, BigDecimal porcCavali, BigDecimal inflacionAnual, Double precioActual, Double utilidadPerdida, Double duracion, Double convexidad, Double total, Double duracionModificada, BigDecimal tceaEmisor, BigDecimal tceaEmisorEscudo, BigDecimal treaBonista, Usuario usuario, Moneda moneda, DiasAnio diasAnio, TipoCapitalizacion tipoCapitalizacion, Aplicante aplicante, FrecuenciaCupon frecuenciaCupon, TasaInteres tasaInteres, TipoPeriodoGracia tipoPeriodoGracia, List<DetalleBono> detallesBono, ResultadosCalculos resultadosCalculos) {
        this.bonoId = bonoId;
        this.valorNominal = valorNominal;
        this.valorComercial = valorComercial;
        this.numAnios = numAnios;
        this.tasaInteresPorc = tasaInteresPorc;
        this.tasaAnualDesc = tasaAnualDesc;
        this.impRenta = impRenta;
        this.fechaEmision = fechaEmision;
        this.porcEstructuracion = porcEstructuracion;
        this.porcColocacion = porcColocacion;
        this.porcFlotacion = porcFlotacion;
        this.porcCavali = porcCavali;
        this.inflacionAnual = inflacionAnual;
    }

}
