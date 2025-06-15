package edu.pe.upc.finanzas.finanzasbackend.repositories;

import edu.pe.upc.finanzas.finanzasbackend.entities.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

    Boolean existsByEmail(String email);
}