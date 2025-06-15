package edu.pe.upc.finanzas.finanzasbackend.serviceinterfaces;

import edu.pe.upc.finanzas.finanzasbackend.entities.Usuario;
import edu.pe.upc.finanzas.finanzasbackend.dtos.UsuarioDTO;

import java.util.List;
import java.util.Optional;

public interface IUsuarioService {

    void insert(UsuarioDTO usuarioDTO);
    List<Usuario> list();
    void delete(Long usuarioId);
    Optional<Usuario> findById(Long usuarioId);
}