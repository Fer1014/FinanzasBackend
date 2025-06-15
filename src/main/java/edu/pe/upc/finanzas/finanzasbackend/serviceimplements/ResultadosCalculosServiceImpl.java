package edu.pe.upc.finanzas.finanzasbackend.serviceimplements;

import edu.pe.upc.finanzas.finanzasbackend.entities.ResultadosCalculos;
import edu.pe.upc.finanzas.finanzasbackend.repositories.ResultadosCalculosRepository;
import edu.pe.upc.finanzas.finanzasbackend.serviceinterfaces.IResultadosCalculosService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ResultadosCalculosServiceImpl implements IResultadosCalculosService {

    private final ResultadosCalculosRepository resultadosCalculosRepository;

    public ResultadosCalculosServiceImpl(ResultadosCalculosRepository resultadosCalculosRepository) {
        this.resultadosCalculosRepository = resultadosCalculosRepository;
    }

    @Override
    public List<ResultadosCalculos> list() {
        return resultadosCalculosRepository.findAll();
    }

    @Override
    public Optional<ResultadosCalculos> findById(Long id) {
        return resultadosCalculosRepository.findById(id);
    }
}