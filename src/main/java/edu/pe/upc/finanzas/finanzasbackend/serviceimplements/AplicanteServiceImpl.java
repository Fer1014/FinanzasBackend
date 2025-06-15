package edu.pe.upc.finanzas.finanzasbackend.serviceimplements;

import edu.pe.upc.finanzas.finanzasbackend.entities.Aplicante;
import edu.pe.upc.finanzas.finanzasbackend.repositories.AplicanteRepository;
import edu.pe.upc.finanzas.finanzasbackend.serviceinterfaces.IAplicanteService;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class AplicanteServiceImpl implements IAplicanteService {

    private final AplicanteRepository aplicanteRepository;

    public AplicanteServiceImpl(AplicanteRepository aplicanteRepository) {
        this.aplicanteRepository = aplicanteRepository;
    }

    @Override
    public List<Aplicante> list() {
        return aplicanteRepository.findAll();
    }
}