package edu.pe.upc.finanzas.finanzasbackend.serviceimplements;

import edu.pe.upc.finanzas.finanzasbackend.dtos.TasaInteresDTO;
import edu.pe.upc.finanzas.finanzasbackend.entities.TasaInteres;
import edu.pe.upc.finanzas.finanzasbackend.repositories.TasaInteresRepository;
import edu.pe.upc.finanzas.finanzasbackend.serviceinterfaces.ITasaInteresService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TasaInteresServiceImpl implements ITasaInteresService {

    private final TasaInteresRepository tasaInteresRepository;

    public TasaInteresServiceImpl(TasaInteresRepository tasaInteresRepository) {
        this.tasaInteresRepository = tasaInteresRepository;
    }

    @Override
    public List<TasaInteres> list() {
        return tasaInteresRepository.findAll();
    }

    @Override
    public TasaInteres create(TasaInteresDTO tasaInteresDTO) {
        TasaInteres tasaInteres = new TasaInteres();
        tasaInteres.setDescripcion(tasaInteresDTO.getDescripcion());
        return tasaInteresRepository.save(tasaInteres);
    }
}