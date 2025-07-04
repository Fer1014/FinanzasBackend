package edu.pe.upc.finanzas.finanzasbackend.controllers;

import edu.pe.upc.finanzas.finanzasbackend.dtos.BonoDTO;
import edu.pe.upc.finanzas.finanzasbackend.entities.Bono;
import edu.pe.upc.finanzas.finanzasbackend.serviceinterfaces.IBonoService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/bono")
@CrossOrigin(origins = "*")
public class BonoController {

    private final IBonoService bonoService;

    public BonoController(IBonoService bonoService) {
        this.bonoService = bonoService;
    }

    @PutMapping("/{id}")
    public ResponseEntity<Bono> actualizarBono(@PathVariable Long id, @RequestBody BonoDTO bonoDTO) {
        Bono bonoActualizado = bonoService.update(id, bonoDTO);
        return ResponseEntity.ok(bonoActualizado);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Bono> obtenerBono(@PathVariable Long id) {
        return bonoService.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @GetMapping
    public ResponseEntity<List<Bono>> listarBonos() {
        return ResponseEntity.ok(bonoService.list());
    }

    @GetMapping("/usuario/{usuarioId}")
    public ResponseEntity<List<Bono>> listarBonosPorUsuario(@PathVariable Long usuarioId) {
        return ResponseEntity.ok(bonoService.findAllByUsuarioId(usuarioId));
    }
}
