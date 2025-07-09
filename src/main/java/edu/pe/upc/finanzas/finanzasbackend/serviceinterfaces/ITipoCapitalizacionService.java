package edu.pe.upc.finanzas.finanzasbackend.serviceinterfaces;

import edu.pe.upc.finanzas.finanzasbackend.dtos.TipoCapitalizacionDTO;
import edu.pe.upc.finanzas.finanzasbackend.entities.TipoCapitalizacion;
import java.util.List;

public interface ITipoCapitalizacionService {
    List<TipoCapitalizacion> list();
    TipoCapitalizacion create(TipoCapitalizacionDTO tipoCapitalizacionDTO);
}