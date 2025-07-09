package edu.pe.upc.finanzas.finanzasbackend.serviceimplements;

import edu.pe.upc.finanzas.finanzasbackend.dtos.MonedaDTO;
import edu.pe.upc.finanzas.finanzasbackend.entities.Moneda;
import edu.pe.upc.finanzas.finanzasbackend.repositories.MonedaRepository;
import edu.pe.upc.finanzas.finanzasbackend.serviceinterfaces.IMonedaService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MonedaServiceImpl implements IMonedaService {

    private final MonedaRepository monedaRepository;

    public MonedaServiceImpl(MonedaRepository monedaRepository) {
        this.monedaRepository = monedaRepository;
    }

    @Override
    public Moneda create(MonedaDTO monedaDTO) {
        Moneda moneda = new Moneda();
        moneda.setDescripcion(monedaDTO.getDescripcion());
        return monedaRepository.save(moneda);
    }

    @Override
    public List<Moneda> list() {
        return monedaRepository.findAll();
    }
}