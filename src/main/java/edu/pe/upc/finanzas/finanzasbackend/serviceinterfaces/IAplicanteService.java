package edu.pe.upc.finanzas.finanzasbackend.serviceinterfaces;

import edu.pe.upc.finanzas.finanzasbackend.dtos.AplicanteDTO;
import edu.pe.upc.finanzas.finanzasbackend.entities.Aplicante;
import java.util.List;

public interface IAplicanteService {
    List<Aplicante> list();
    Aplicante create(AplicanteDTO aplicanteDTO);
}