package edu.pe.upc.finanzas.finanzasbackend.repositories;

import edu.pe.upc.finanzas.finanzasbackend.entities.DetalleBono;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DetalleBonoRepository extends JpaRepository<DetalleBono, Long> {
}