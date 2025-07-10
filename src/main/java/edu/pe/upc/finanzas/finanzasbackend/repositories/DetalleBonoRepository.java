package edu.pe.upc.finanzas.finanzasbackend.repositories;

import edu.pe.upc.finanzas.finanzasbackend.entities.DetalleBono;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DetalleBonoRepository extends JpaRepository<DetalleBono, Long> {
    List<DetalleBono> findAllByBono_BonoId(Long bonoId);
}