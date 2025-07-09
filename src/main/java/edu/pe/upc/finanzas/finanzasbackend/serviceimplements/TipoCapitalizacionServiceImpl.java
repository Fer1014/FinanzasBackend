package edu.pe.upc.finanzas.finanzasbackend.serviceimplements;

import edu.pe.upc.finanzas.finanzasbackend.dtos.TipoCapitalizacionDTO;
import edu.pe.upc.finanzas.finanzasbackend.entities.TipoCapitalizacion;
import edu.pe.upc.finanzas.finanzasbackend.repositories.TipoCapitalizacionRepository;
import edu.pe.upc.finanzas.finanzasbackend.serviceinterfaces.ITipoCapitalizacionService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TipoCapitalizacionServiceImpl implements ITipoCapitalizacionService {

    private final TipoCapitalizacionRepository tipoCapitalizacionRepository;

    public TipoCapitalizacionServiceImpl(TipoCapitalizacionRepository tipoCapitalizacionRepository) {
        this.tipoCapitalizacionRepository = tipoCapitalizacionRepository;
    }

    @Override
    public TipoCapitalizacion create(TipoCapitalizacionDTO dto) {
        TipoCapitalizacion tipo = new TipoCapitalizacion();
        tipo.setDescripcion(dto.getDescripcion());
        return tipoCapitalizacionRepository.save(tipo);
    }


    @Override
    public List<TipoCapitalizacion> list() {
        return tipoCapitalizacionRepository.findAll();
    }
}