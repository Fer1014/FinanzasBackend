package edu.pe.upc.finanzas.finanzasbackend.serviceimplements;

import edu.pe.upc.finanzas.finanzasbackend.dtos.DetalleBonoDTO;
import edu.pe.upc.finanzas.finanzasbackend.entities.DetalleBono;
import edu.pe.upc.finanzas.finanzasbackend.repositories.BonoRepository;
import edu.pe.upc.finanzas.finanzasbackend.repositories.DetalleBonoRepository;
import edu.pe.upc.finanzas.finanzasbackend.serviceinterfaces.IDetalleBonoService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DetalleBonoServiceImpl implements IDetalleBonoService {

    private final DetalleBonoRepository detalleBonoRepository;
    private final BonoRepository bonoRepository;

    public DetalleBonoServiceImpl(DetalleBonoRepository detalleBonoRepository, BonoRepository bonoRepository) {
        this.detalleBonoRepository = detalleBonoRepository;
        this.bonoRepository = bonoRepository;
    }

    @Override
    public DetalleBono create(DetalleBonoDTO detalleBonoDTO){
        DetalleBono detalleBono = new DetalleBono();
        detalleBono.setPeriodo(detalleBonoDTO.getPeriodo());
        detalleBono.setFechaProgramada(detalleBonoDTO.getFechaProgramada());
        detalleBono.setInflacionTipo(detalleBonoDTO.getInflacionTipo());
        detalleBono.setBonoValor(detalleBonoDTO.getBonoValor());
        detalleBono.setBonoIndexado(detalleBonoDTO.getBonoIndexado());
        detalleBono.setCuponInteres(detalleBonoDTO.getCuponInteres());
        detalleBono.setCuota(detalleBonoDTO.getCuota());
        detalleBono.setAmortizacion(detalleBonoDTO.getAmortizacion());
        detalleBono.setPrima(detalleBonoDTO.getPrima());
        detalleBono.setEscudo(detalleBonoDTO.getEscudo());
        detalleBono.setFlujoEmisor(detalleBonoDTO.getFlujoEmisor());
        detalleBono.setFlujoEmisorEscudo(detalleBonoDTO.getFlujoEmisorEscudo());
        detalleBono.setFlujoBonista(detalleBonoDTO.getFlujoBonista());
        detalleBono.setFlujoActual(detalleBonoDTO.getFlujoActual());
        detalleBono.setFlujoActPlazo(detalleBonoDTO.getFlujoActPlazo());
        detalleBono.setFactorConvexidad(detalleBonoDTO.getFactorConvexidad());
        detalleBono.setBono(bonoRepository.findById(detalleBonoDTO.getBonoId())
                .orElseThrow(() -> new RuntimeException("Bono not found with id: " + detalleBonoDTO.getBonoId())));

        return detalleBonoRepository.save(detalleBono);
    }

    @Override
    public List<DetalleBono> findallByBonoId(Long bonoId) {
        return detalleBonoRepository.findAllByBono_BonoId(bonoId);
    }

    @Override
    public List<DetalleBono> list() {
        return detalleBonoRepository.findAll();
    }

    @Override
    public Optional<DetalleBono> findById(Long id) {
        return detalleBonoRepository.findById(id);
    }
}