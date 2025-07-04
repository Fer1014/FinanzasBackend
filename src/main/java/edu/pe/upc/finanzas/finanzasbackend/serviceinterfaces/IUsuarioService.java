package edu.pe.upc.finanzas.finanzasbackend.serviceinterfaces;

import edu.pe.upc.finanzas.finanzasbackend.entities.Usuario;

import java.util.List;


public interface IUsuarioService {

    public void insert(Usuario usuario);
    public List<Usuario> list();
    public void delete(Long usuarioId);
    void update(Usuario u);
}