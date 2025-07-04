package edu.pe.upc.finanzas.finanzasbackend.controllers;


import edu.pe.upc.finanzas.finanzasbackend.dtos.UsuarioDTO;
import edu.pe.upc.finanzas.finanzasbackend.entities.Usuario;
import edu.pe.upc.finanzas.finanzasbackend.serviceinterfaces.IUsuarioService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;


@RestController
@RequestMapping("/usuarios")
public class UsuarioController {
    @Autowired
    private IUsuarioService uS;

    @PostMapping
    public ResponseEntity<Void> registrar(@RequestBody UsuarioDTO dto) {
        ModelMapper m = new ModelMapper();
        Usuario u = m.map(dto, Usuario.class);
        u.setUsuarioId(null); // Forzar null para crear nuevo
        uS.insert(u);
        return ResponseEntity.ok().build();
    }

    @GetMapping
    public List<UsuarioDTO> list() {
        return uS.list().stream().map(x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x, UsuarioDTO.class);
        }).collect(Collectors.toList());
    }

    @DeleteMapping("/{usuarioId}")
    public void eliminar(@PathVariable("usuarioId") Long usuarioId) {
        uS.delete(usuarioId);
    }

    @PutMapping
    public ResponseEntity<Void> actualizar(@RequestBody UsuarioDTO dto) {
        if (dto.getUsuarioId() == null) {
            return ResponseEntity.badRequest().build();
        }
        ModelMapper m = new ModelMapper();
        Usuario u = m.map(dto, Usuario.class);
        uS.update(u);
        return ResponseEntity.ok().build();
    }





}
