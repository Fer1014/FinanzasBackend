package edu.pe.upc.finanzas.finanzasbackend.repositories;

import edu.pe.upc.finanzas.finanzasbackend.entities.Bono;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BonoRepository extends JpaRepository<Bono, Long> {

    List<Bono> findAllByUsuario_UsuarioId(Long usuarioId);
}