package edu.pe.upc.finanzas.finanzasbackend.controllers;

import edu.pe.upc.finanzas.finanzasbackend.dtos.AplicanteDTO;
import edu.pe.upc.finanzas.finanzasbackend.entities.Aplicante;
import edu.pe.upc.finanzas.finanzasbackend.serviceinterfaces.IAplicanteService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/aplicantes")
@CrossOrigin(origins = "*")
public class AplicanteController {

    private final IAplicanteService aplicanteService;

    public AplicanteController(IAplicanteService aplicanteService) {
        this.aplicanteService = aplicanteService;
    }

    @GetMapping
    public ResponseEntity<List<Aplicante>> listarAplicantes() {
        return ResponseEntity.ok(aplicanteService.list());
    }

    @PostMapping
    public ResponseEntity<Aplicante> crearAplicante(@RequestBody AplicanteDTO aplicanteDTO) {
        Aplicante aplicante = aplicanteService.create(aplicanteDTO);
        return ResponseEntity.ok(aplicante);
    }
}