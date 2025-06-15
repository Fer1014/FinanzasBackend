package edu.pe.upc.finanzas.finanzasbackend.serviceinterfaces;

import edu.pe.upc.finanzas.finanzasbackend.entities.Bono;
import edu.pe.upc.finanzas.finanzasbackend.dtos.BonoDTO;

import java.util.List;
import java.util.Optional;

public interface IBonoService {

    Bono create(BonoDTO bonoDTO);
    Bono update(Long bonoId, BonoDTO bonoDTO);
    void delete(Long bonoId);
    Optional<Bono> findById(Long bonoId);
    List<Bono> list();
    List<Bono> findAllByUsuarioId(Long usuarioId);
}