package edu.pe.upc.finanzas.finanzasbackend.controllers;

import edu.pe.upc.finanzas.finanzasbackend.dtos.MonedaDTO;
import edu.pe.upc.finanzas.finanzasbackend.entities.Moneda;
import edu.pe.upc.finanzas.finanzasbackend.serviceinterfaces.IMonedaService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/monedas")
@CrossOrigin(origins = "*")
public class MonedaController {

    private final IMonedaService monedaService;

    public MonedaController(IMonedaService monedaService) {
        this.monedaService = monedaService;
    }

    @GetMapping
    public ResponseEntity<List<Moneda>> listarMonedas() {
        return ResponseEntity.ok(monedaService.list());
    }

    @PostMapping
    public ResponseEntity<Moneda> crearMoneda(@RequestBody MonedaDTO monedaDTO) {
        Moneda moneda = monedaService.create(monedaDTO);
        return ResponseEntity.ok(moneda);
    }
}