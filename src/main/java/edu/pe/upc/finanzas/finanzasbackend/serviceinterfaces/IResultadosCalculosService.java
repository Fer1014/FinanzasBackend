package edu.pe.upc.finanzas.finanzasbackend.serviceinterfaces;

import edu.pe.upc.finanzas.finanzasbackend.entities.Bono;
import edu.pe.upc.finanzas.finanzasbackend.entities.ResultadosCalculos;
import java.util.List;
import java.util.Optional;

public interface IResultadosCalculosService {
    List<ResultadosCalculos> list();

    ResultadosCalculos calcularResultados(Bono bono);
}