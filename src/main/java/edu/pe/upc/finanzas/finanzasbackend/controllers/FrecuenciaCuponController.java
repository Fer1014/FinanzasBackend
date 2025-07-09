package edu.pe.upc.finanzas.finanzasbackend.controllers;

import edu.pe.upc.finanzas.finanzasbackend.dtos.FrecuenciaCuponDTO;
import edu.pe.upc.finanzas.finanzasbackend.entities.FrecuenciaCupon;
import edu.pe.upc.finanzas.finanzasbackend.serviceinterfaces.IFrecuenciaCuponService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/frecuencias-cupon")
@CrossOrigin(origins = "*")
public class FrecuenciaCuponController {

    private final IFrecuenciaCuponService frecuenciaCuponService;

    public FrecuenciaCuponController(IFrecuenciaCuponService frecuenciaCuponService) {
        this.frecuenciaCuponService = frecuenciaCuponService;
    }

    @GetMapping
    public ResponseEntity<List<FrecuenciaCupon>> listarFrecuenciasCupon() {
        return ResponseEntity.ok(frecuenciaCuponService.list());
    }


    @PostMapping
    public ResponseEntity<FrecuenciaCupon> crearFrecuenciaCupon(@RequestBody FrecuenciaCuponDTO frecuenciaCuponDTO) {
        FrecuenciaCupon frecuenciaCupon = frecuenciaCuponService.create(frecuenciaCuponDTO);
        return ResponseEntity.ok(frecuenciaCupon);
    }
}