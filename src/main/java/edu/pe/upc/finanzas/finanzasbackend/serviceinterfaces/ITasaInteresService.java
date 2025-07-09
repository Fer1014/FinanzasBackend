package edu.pe.upc.finanzas.finanzasbackend.serviceinterfaces;

import edu.pe.upc.finanzas.finanzasbackend.dtos.TasaInteresDTO;
import edu.pe.upc.finanzas.finanzasbackend.entities.TasaInteres;
import java.util.List;

public interface ITasaInteresService {
    List<TasaInteres> list();
    TasaInteres create(TasaInteresDTO tasaInteresDTO);
}