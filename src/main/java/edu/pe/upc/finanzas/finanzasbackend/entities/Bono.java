package edu.pe.upc.finanzas.finanzasbackend.entities;

import jakarta.persistence.*;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

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
    @Column(name = "precio_actual")
    private Double precioActual;
    @Column(name = "utilidad_perdida")
    private Double utilidadPerdida;
    @Column(name = "duracion")
    private Double duracion;
    @Column(name = "convexidad")
    private Double convexidad;
    @Column(name = "total")
    private Double total;
    @Column(name = "duracion_modificada")
    private Double duracionModificada;
    @Column(name = "tcea_emisor", precision = 5, scale = 3)
    private BigDecimal tceaEmisor;
    @Column(name = "tcea_emisor_escudo", precision = 5, scale = 3)
    private BigDecimal tceaEmisorEscudo;
    @Column(name = "trea_bonista", precision = 5, scale = 3)
    private BigDecimal treaBonista;

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
        this.precioActual = precioActual;
        this.utilidadPerdida = utilidadPerdida;
        this.duracion = duracion;
        this.convexidad = convexidad;
        this.total = total;
        this.duracionModificada = duracionModificada;
        this.tceaEmisor = tceaEmisor;
        this.tceaEmisorEscudo = tceaEmisorEscudo;
        this.treaBonista = treaBonista;
        this.usuario = usuario;
        this.moneda = moneda;
        this.diasAnio = diasAnio;
        this.tipoCapitalizacion = tipoCapitalizacion;
        this.aplicante = aplicante;
        this.frecuenciaCupon = frecuenciaCupon;
        this.tasaInteres = tasaInteres;
        this.tipoPeriodoGracia = tipoPeriodoGracia;
        this.detallesBono = detallesBono;
        this.resultadosCalculos = resultadosCalculos;
    }

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

    public Double getPrecioActual() {
        return precioActual;
    }

    public void setPrecioActual(Double precioActual) {
        this.precioActual = precioActual;
    }

    public Double getUtilidadPerdida() {
        return utilidadPerdida;
    }

    public void setUtilidadPerdida(Double utilidadPerdida) {
        this.utilidadPerdida = utilidadPerdida;
    }

    public Double getDuracion() {
        return duracion;
    }

    public void setDuracion(Double duracion) {
        this.duracion = duracion;
    }

    public Double getConvexidad() {
        return convexidad;
    }

    public void setConvexidad(Double convexidad) {
        this.convexidad = convexidad;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }

    public Double getDuracionModificada() {
        return duracionModificada;
    }

    public void setDuracionModificada(Double duracionModificada) {
        this.duracionModificada = duracionModificada;
    }

    public BigDecimal getTceaEmisor() {
        return tceaEmisor;
    }

    public void setTceaEmisor(BigDecimal tceaEmisor) {
        this.tceaEmisor = tceaEmisor;
    }

    public BigDecimal getTceaEmisorEscudo() {
        return tceaEmisorEscudo;
    }

    public void setTceaEmisorEscudo(BigDecimal tceaEmisorEscudo) {
        this.tceaEmisorEscudo = tceaEmisorEscudo;
    }

    public BigDecimal getTreaBonista() {
        return treaBonista;
    }

    public void setTreaBonista(BigDecimal treaBonista) {
        this.treaBonista = treaBonista;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Moneda getMoneda() {
        return moneda;
    }

    public void setMoneda(Moneda moneda) {
        this.moneda = moneda;
    }

    public DiasAnio getDiasAnio() {
        return diasAnio;
    }

    public void setDiasAnio(DiasAnio diasAnio) {
        this.diasAnio = diasAnio;
    }

    public TipoCapitalizacion getTipoCapitalizacion() {
        return tipoCapitalizacion;
    }

    public void setTipoCapitalizacion(TipoCapitalizacion tipoCapitalizacion) {
        this.tipoCapitalizacion = tipoCapitalizacion;
    }

    public Aplicante getAplicante() {
        return aplicante;
    }

    public void setAplicante(Aplicante aplicante) {
        this.aplicante = aplicante;
    }

    public FrecuenciaCupon getFrecuenciaCupon() {
        return frecuenciaCupon;
    }

    public void setFrecuenciaCupon(FrecuenciaCupon frecuenciaCupon) {
        this.frecuenciaCupon = frecuenciaCupon;
    }

    public TasaInteres getTasaInteres() {
        return tasaInteres;
    }

    public void setTasaInteres(TasaInteres tasaInteres) {
        this.tasaInteres = tasaInteres;
    }

    public TipoPeriodoGracia getTipoPeriodoGracia() {
        return tipoPeriodoGracia;
    }

    public void setTipoPeriodoGracia(TipoPeriodoGracia tipoPeriodoGracia) {
        this.tipoPeriodoGracia = tipoPeriodoGracia;
    }

    public List<DetalleBono> getDetallesBono() {
        return detallesBono;
    }

    public void setDetallesBono(List<DetalleBono> detallesBono) {
        this.detallesBono = detallesBono;
    }

    public ResultadosCalculos getResultadosCalculos() {
        return resultadosCalculos;
    }

    public void setResultadosCalculos(ResultadosCalculos resultadosCalculos) {
        this.resultadosCalculos = resultadosCalculos;
    }
}
