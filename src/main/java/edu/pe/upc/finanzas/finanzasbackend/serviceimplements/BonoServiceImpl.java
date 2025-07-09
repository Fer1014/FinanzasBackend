package edu.pe.upc.finanzas.finanzasbackend.serviceimplements;

import edu.pe.upc.finanzas.finanzasbackend.dtos.BonoDTO;
import edu.pe.upc.finanzas.finanzasbackend.entities.Bono;
import edu.pe.upc.finanzas.finanzasbackend.repositories.BonoRepository;
import edu.pe.upc.finanzas.finanzasbackend.serviceinterfaces.IBonoService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BonoServiceImpl implements IBonoService {

    private final BonoRepository bonoRepository;

    public BonoServiceImpl(BonoRepository bonoRepository) {
        this.bonoRepository = bonoRepository;
    }

    @Override
    public Bono create(BonoDTO bonoDTO) {
        Bono bono = new Bono();
        bono.setValorNominal(bonoDTO.getValorNominal());
        bono.setValorComercial(bonoDTO.getValorComercial());
        bono.setNumAnios(bonoDTO.getNumAnios());
        bono.setTasaInteresPorc(bonoDTO.getTasaInteresPorc());
        bono.setTasaAnualDesc(bonoDTO.getTasaAnualDesc());
        bono.setImpRenta(bonoDTO.getImpRenta());
        bono.setFechaEmision(bonoDTO.getFechaEmision());
        bono.setPorcEstructuracion(bonoDTO.getPorcEstructuracion());
        bono.setPorcColocacion(bonoDTO.getPorcColocacion());
        bono.setPorcFlotacion(bonoDTO.getPorcFlotacion());
        bono.setPorcCavali(bonoDTO.getPorcCavali());
        bono.setInflacionAnual(bonoDTO.getInflacionAnual());
        return bonoRepository.save(bono);
    }

    @Override
    public Bono update(Long bonoId, BonoDTO bonoDTO) {
        Optional<Bono> optionalBono = bonoRepository.findById(bonoId);
        if (optionalBono.isPresent()) {
            Bono bono = optionalBono.get();
            bono.setValorNominal(bonoDTO.getValorNominal());
            bono.setValorComercial(bonoDTO.getValorComercial());
            bono.setNumAnios(bonoDTO.getNumAnios());
            bono.setTasaInteresPorc(bonoDTO.getTasaInteresPorc());
            bono.setTasaAnualDesc(bonoDTO.getTasaAnualDesc());
            bono.setImpRenta(bonoDTO.getImpRenta());
            bono.setFechaEmision(bonoDTO.getFechaEmision());
            bono.setPorcEstructuracion(bonoDTO.getPorcEstructuracion());
            bono.setPorcColocacion(bonoDTO.getPorcColocacion());
            bono.setPorcFlotacion(bonoDTO.getPorcFlotacion());
            bono.setPorcCavali(bonoDTO.getPorcCavali());
            bono.setInflacionAnual(bonoDTO.getInflacionAnual());
            return bonoRepository.save(bono);
        }
        return null;
    }

    @Override
    public void delete(Long bonoId) {
        bonoRepository.deleteById(bonoId);
    }

    @Override
    public Optional<Bono> findById(Long bonoId) {
        return bonoRepository.findById(bonoId);
    }

    @Override
    public List<Bono> list() {
        return bonoRepository.findAll();
    }

    @Override
    public List<Bono> findAllByUsuarioId(Long usuarioId) {
        return bonoRepository.findAllByUsuario_UsuarioId(usuarioId);
    }
}
