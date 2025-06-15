package edu.pe.upc.finanzas.finanzasbackend.serviceinterfaces;

import edu.pe.upc.finanzas.finanzasbackend.entities.DetalleBono;
import java.util.List;
import java.util.Optional;

public interface IDetalleBonoService {
    List<DetalleBono> list();
    Optional<DetalleBono> findById(Long id);
}