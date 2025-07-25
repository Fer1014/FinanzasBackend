package edu.pe.upc.finanzas.finanzasbackend.dtos;

import jakarta.persistence.Column;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDate;

@Data
public class BonoDTO {
    private Double valorNominal;
    private Double valorComercial;
    private Long numAnios;
    private BigDecimal tasaInteresPorc;
    private BigDecimal tasaAnualDesc;
    private Long impRenta;
    private LocalDate fechaEmision;
    private BigDecimal porcPrima;
    private BigDecimal porcEstructuracion;
    private BigDecimal porcColocacion;
    private BigDecimal porcFlotacion;
    private BigDecimal porcCavali;
    private BigDecimal inflacionAnual;
    private Long usuarioId;
    private Long monedaId;
    private Long diasAnioId;
    private Long tipoCapitalizacionId;
    private Long aplicanteId;
    private Long frecuenciaCuponId;
    private Long tasaInteresId;
    private Long tipoPeriodoGraciaId;

}
