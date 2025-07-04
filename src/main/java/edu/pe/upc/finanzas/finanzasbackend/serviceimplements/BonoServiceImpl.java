package edu.pe.upc.finanzas.finanzasbackend.serviceimplements;

import edu.pe.upc.finanzas.finanzasbackend.dtos.BonoDTO;
import edu.pe.upc.finanzas.finanzasbackend.entities.Bono;
import edu.pe.upc.finanzas.finanzasbackend.serviceinterfaces.IBonoService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BonoServiceImpl implements IBonoService {

    @Override
    public Bono create(BonoDTO bonoDTO) {
        // Implementación aquí
        return null;
    }

    @Override
    public Bono update(Long bonoId, BonoDTO bonoDTO) {
        // Implementación aquí
        return null;
    }

    @Override
    public void delete(Long bonoId) {
        // Implementación aquí
    }

    @Override
    public Optional<Bono> findById(Long bonoId) {
        // Implementación aquí
        return Optional.empty();
    }

    @Override
    public List<Bono> list() {
        // Implementación aquí
        return null;
    }

    @Override
    public List<Bono> findAllByUsuarioId(Long usuarioId) {
        // Implementación aquí
        return null;
    }
}
