package edu.pe.upc.finanzas.finanzasbackend.serviceimplements;

import edu.pe.upc.finanzas.finanzasbackend.entities.Bono;
import edu.pe.upc.finanzas.finanzasbackend.entities.ResultadosCalculos;
import edu.pe.upc.finanzas.finanzasbackend.repositories.ResultadosCalculosRepository;
import edu.pe.upc.finanzas.finanzasbackend.serviceinterfaces.IResultadosCalculosService;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.List;

@Service
public class ResultadosCalculosServiceImpl implements IResultadosCalculosService {

    private final ResultadosCalculosRepository resultadosCalculosRepository;

    public ResultadosCalculosServiceImpl(ResultadosCalculosRepository resultadosCalculosRepository) {
        this.resultadosCalculosRepository = resultadosCalculosRepository;
    }

    @Override
    public List<ResultadosCalculos> list() {
        return resultadosCalculosRepository.findAll();
    }

    @Override
    public ResultadosCalculos calcularResultados(Bono bono) {

        // 1. Frecuencia de cupón por año
        long frecuenciaCuponNum = switch (bono.getFrecuenciaCupon().getDescripcion().toLowerCase()) {
            case "mensual" -> 12L;
            case "bimestral" -> 6L;
            case "trimestral" -> 4L;
            case "cuatrimestral" -> 3L;
            case "semestral" -> 2L;
            default -> 1L; // anual
        };

        // 2. Días de capitalización
        long diasCap = switch (bono.getTipoCapitalizacion().getDescripcion().toLowerCase()) {
            case "diaria" -> 1L;
            case "quincenal" -> 15L;
            case "mensual" -> 30L;
            case "bimestral" -> 60L;
            case "trimestral" -> 90L;
            case "cuatrimestral" -> 120L;
            case "semestral" -> 180L;
            default -> 360L;
        };

        long diasAnio = bono.getDiasAnio().getDias();
        long numPeriodoAnio = diasAnio / (360L / frecuenciaCuponNum);
        long numTotalPeriodo = bono.getNumAnios() * numPeriodoAnio;

        // 3. Tasa efectiva anual
        BigDecimal tasaNominal = bono.getTasaInteresPorc()
                .divide(BigDecimal.valueOf(100), 10, RoundingMode.HALF_UP);

        BigDecimal tasaEfeAnual = bono.getTasaInteres().getDescripcion().equalsIgnoreCase("efectiva")
                ? tasaNominal
                : BigDecimal.valueOf(Math.pow(
                1 + (tasaNominal.doubleValue() / (diasAnio / (double) diasCap)),
                diasAnio / (double) diasCap
        ) - 1).setScale(10, RoundingMode.HALF_UP);

        // 4. COK Tipo
        BigDecimal tasaAnualDesc = bono.getTasaAnualDesc()
                .divide(BigDecimal.valueOf(100), 10, RoundingMode.HALF_UP);

        BigDecimal cokTipo = BigDecimal.valueOf(Math.pow(
                1 + tasaAnualDesc.doubleValue(),
                (360.0 / frecuenciaCuponNum) / diasAnio
        ) - 1).setScale(10, RoundingMode.HALF_UP);

        // 5. Costes iniciales
        BigDecimal porcentajeEmisor = bono.getPorcEstructuracion()
                .add(bono.getPorcColocacion())
                .add(bono.getPorcFlotacion())
                .add(bono.getPorcCavali())
                .divide(BigDecimal.valueOf(100), 10, RoundingMode.HALF_UP);

        BigDecimal porcentajeBonista = bono.getPorcFlotacion()
                .add(bono.getPorcCavali())
                .divide(BigDecimal.valueOf(100), 10, RoundingMode.HALF_UP);

        BigDecimal valorComercial = BigDecimal.valueOf(bono.getValorComercial());

        double costesInicialesEmisor = valorComercial.multiply(porcentajeEmisor)
                .setScale(10, RoundingMode.HALF_UP).doubleValue();

        double costesInicialesBonista = valorComercial.multiply(porcentajeBonista)
                .setScale(10, RoundingMode.HALF_UP).doubleValue();

        // Crear y poblar la entidad ResultadosCalculos
        ResultadosCalculos resultado = new ResultadosCalculos();
        resultado.setFrecuenciaCuponNum(frecuenciaCuponNum);
        resultado.setDiasCap(diasCap);
        resultado.setNumPeriodoAnio(numPeriodoAnio);
        resultado.setNumTotalPeriodo(numTotalPeriodo);
        resultado.setTasaEfeAnual(tasaEfeAnual.setScale(5, RoundingMode.HALF_UP));
        resultado.setCokTipo(cokTipo.setScale(5, RoundingMode.HALF_UP));
        resultado.setCostesInicialesEmisor(costesInicialesEmisor);
        resultado.setCostesInicialesBonista(costesInicialesBonista);
        resultado.setBono(bono);

        return resultado;
    }
}