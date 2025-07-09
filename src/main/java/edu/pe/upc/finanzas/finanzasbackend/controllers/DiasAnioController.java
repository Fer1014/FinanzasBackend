package edu.pe.upc.finanzas.finanzasbackend.controllers;

import edu.pe.upc.finanzas.finanzasbackend.dtos.DiasAnioDTO;
import edu.pe.upc.finanzas.finanzasbackend.entities.DiasAnio;
import edu.pe.upc.finanzas.finanzasbackend.serviceinterfaces.IDiasAnioService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/dias-anio")
@CrossOrigin(origins = "*")
public class DiasAnioController {

    private final IDiasAnioService diasAnioService;

    public DiasAnioController(IDiasAnioService diasAnioService) {
        this.diasAnioService = diasAnioService;
    }

    @GetMapping
    public ResponseEntity<List<DiasAnio>> listarDiasAnio() {
        return ResponseEntity.ok(diasAnioService.list());
    }

    @PostMapping
    public ResponseEntity<DiasAnio> crearDiaAnio(@RequestBody DiasAnioDTO diasAnioDTO) {
        DiasAnio diasAnio = diasAnioService.create(diasAnioDTO);
        return ResponseEntity.ok(diasAnio);
    }
}