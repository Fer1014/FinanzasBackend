package edu.pe.upc.finanzas.finanzasbackend.serviceinterfaces;

import edu.pe.upc.finanzas.finanzasbackend.dtos.MonedaDTO;
import edu.pe.upc.finanzas.finanzasbackend.entities.Moneda;
import java.util.List;

public interface IMonedaService {
    List<Moneda> list();
    Moneda create(MonedaDTO monedaDTO);
}