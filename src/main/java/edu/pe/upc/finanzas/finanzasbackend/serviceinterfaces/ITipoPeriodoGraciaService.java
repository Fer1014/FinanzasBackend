package edu.pe.upc.finanzas.finanzasbackend.serviceinterfaces;

import edu.pe.upc.finanzas.finanzasbackend.dtos.TipoPeriodoGraciaDTO;
import edu.pe.upc.finanzas.finanzasbackend.entities.TipoPeriodoGracia;
import java.util.List;

public interface ITipoPeriodoGraciaService {
    List<TipoPeriodoGracia> list();
    TipoPeriodoGracia create(TipoPeriodoGraciaDTO tipoPeriodoGraciaDTO);
}