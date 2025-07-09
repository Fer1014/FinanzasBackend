package edu.pe.upc.finanzas.finanzasbackend.serviceinterfaces;

import edu.pe.upc.finanzas.finanzasbackend.dtos.DiasAnioDTO;
import edu.pe.upc.finanzas.finanzasbackend.entities.DiasAnio;
import java.util.List;

public interface IDiasAnioService {
    DiasAnio create(DiasAnioDTO diasAnioDTO);
    List<DiasAnio> list();
}