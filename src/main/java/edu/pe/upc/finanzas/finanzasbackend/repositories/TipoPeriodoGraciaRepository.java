package edu.pe.upc.finanzas.finanzasbackend.repositories;

import edu.pe.upc.finanzas.finanzasbackend.entities.TipoPeriodoGracia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TipoPeriodoGraciaRepository extends JpaRepository<TipoPeriodoGracia, Long> {
}