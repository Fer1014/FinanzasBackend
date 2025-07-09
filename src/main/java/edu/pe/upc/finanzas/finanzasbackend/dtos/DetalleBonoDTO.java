package edu.pe.upc.finanzas.finanzasbackend.dtos;

import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDate;

@Data
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

}
