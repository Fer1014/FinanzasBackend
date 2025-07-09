package edu.pe.upc.finanzas.finanzasbackend.serviceimplements;

import edu.pe.upc.finanzas.finanzasbackend.dtos.TipoPeriodoGraciaDTO;
import edu.pe.upc.finanzas.finanzasbackend.entities.TipoPeriodoGracia;
import edu.pe.upc.finanzas.finanzasbackend.repositories.TipoPeriodoGraciaRepository;
import edu.pe.upc.finanzas.finanzasbackend.serviceinterfaces.ITipoPeriodoGraciaService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TipoPeriodoGraciaServiceImpl implements ITipoPeriodoGraciaService {

    private final TipoPeriodoGraciaRepository tipoPeriodoGraciaRepository;

    public TipoPeriodoGraciaServiceImpl(TipoPeriodoGraciaRepository tipoPeriodoGraciaRepository) {
        this.tipoPeriodoGraciaRepository = tipoPeriodoGraciaRepository;
    }

    @Override
    public TipoPeriodoGracia create(TipoPeriodoGraciaDTO dto) {
        TipoPeriodoGracia tipoPeriodo = new TipoPeriodoGracia();
        tipoPeriodo.setDescripcion(dto.getDescripcion());
        // Mapear otros campos si hay
        return tipoPeriodoGraciaRepository.save(tipoPeriodo);
    }

    @Override
    public List<TipoPeriodoGracia> list() {
        return tipoPeriodoGraciaRepository.findAll();
    }
}