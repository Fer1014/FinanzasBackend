package edu.pe.upc.finanzas.finanzasbackend.serviceimplements;

import edu.pe.upc.finanzas.finanzasbackend.entities.DetalleBono;
import edu.pe.upc.finanzas.finanzasbackend.repositories.DetalleBonoRepository;
import edu.pe.upc.finanzas.finanzasbackend.serviceinterfaces.IDetalleBonoService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DetalleBonoServiceImpl implements IDetalleBonoService {

    private final DetalleBonoRepository detalleBonoRepository;

    public DetalleBonoServiceImpl(DetalleBonoRepository detalleBonoRepository) {
        this.detalleBonoRepository = detalleBonoRepository;
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