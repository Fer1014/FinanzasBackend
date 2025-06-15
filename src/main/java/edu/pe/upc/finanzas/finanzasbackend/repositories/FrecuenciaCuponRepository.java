package edu.pe.upc.finanzas.finanzasbackend.repositories;

import edu.pe.upc.finanzas.finanzasbackend.entities.FrecuenciaCupon;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FrecuenciaCuponRepository extends JpaRepository<FrecuenciaCupon, Long> {
}