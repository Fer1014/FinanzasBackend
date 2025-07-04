package edu.pe.upc.finanzas.finanzasbackend.serviceimplements;

import edu.pe.upc.finanzas.finanzasbackend.entities.Usuario;
import edu.pe.upc.finanzas.finanzasbackend.repositories.UsuarioRepository;
import edu.pe.upc.finanzas.finanzasbackend.serviceinterfaces.IUsuarioService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class UsuarioServiceImpl implements IUsuarioService {
    @Autowired
    private UsuarioRepository uR;

    @Override
    public void insert(Usuario usuario) {
        uR.save(usuario);
    }

    @Override
    public void update(Usuario usuario) {
        if (uR.existsById(usuario.getUsuarioId())) {
            uR.save(usuario);
        }
    }

    @Override
    public List<Usuario> list() {
        return uR.findAll();
    }

    @Override
    public void delete(Long usuarioId) {
        uR.deleteById(usuarioId);
    }





}
