package edu.pe.upc.finanzas.finanzasbackend.serviceimplements;

import edu.pe.upc.finanzas.finanzasbackend.entities.FrecuenciaCupon;
import edu.pe.upc.finanzas.finanzasbackend.repositories.FrecuenciaCuponRepository;
import edu.pe.upc.finanzas.finanzasbackend.serviceinterfaces.IFrecuenciaCuponService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FrecuenciaCuponServiceImpl implements IFrecuenciaCuponService {

    private final FrecuenciaCuponRepository frecuenciaCuponRepository;

    public FrecuenciaCuponServiceImpl(FrecuenciaCuponRepository frecuenciaCuponRepository) {
        this.frecuenciaCuponRepository = frecuenciaCuponRepository;
    }

    @Override
    public List<FrecuenciaCupon> list() {
        return frecuenciaCuponRepository.findAll();
    }
}