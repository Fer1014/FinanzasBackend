package edu.pe.upc.finanzas.finanzasbackend.serviceimplements;

import edu.pe.upc.finanzas.finanzasbackend.dtos.DiasAnioDTO;
import edu.pe.upc.finanzas.finanzasbackend.entities.DiasAnio;
import edu.pe.upc.finanzas.finanzasbackend.repositories.DiasAnioRepository;
import edu.pe.upc.finanzas.finanzasbackend.serviceinterfaces.IDiasAnioService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DiasAnioServiceImpl implements IDiasAnioService {

    private final DiasAnioRepository diasAnioRepository;

    public DiasAnioServiceImpl(DiasAnioRepository diasAnioRepository) {
        this.diasAnioRepository = diasAnioRepository;
    }

    @Override
    public DiasAnio create(DiasAnioDTO diasAnioDTO) {
        DiasAnio diasAnio = new DiasAnio();
        diasAnio.setDias(diasAnioDTO.getDias());
        return diasAnioRepository.save(diasAnio);
    }
    
    @Override
    public List<DiasAnio> list() {
        return diasAnioRepository.findAll();
    }
}