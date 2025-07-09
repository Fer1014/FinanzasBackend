package edu.pe.upc.finanzas.finanzasbackend.serviceinterfaces;

import edu.pe.upc.finanzas.finanzasbackend.dtos.FrecuenciaCuponDTO;
import edu.pe.upc.finanzas.finanzasbackend.entities.FrecuenciaCupon;
import java.util.List;

public interface IFrecuenciaCuponService {
    List<FrecuenciaCupon> list();
    FrecuenciaCupon create(FrecuenciaCuponDTO frecuenciaCuponDTO);
}