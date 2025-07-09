package edu.pe.upc.finanzas.finanzasbackend.controllers;

import edu.pe.upc.finanzas.finanzasbackend.dtos.TasaInteresDTO;
import edu.pe.upc.finanzas.finanzasbackend.entities.TasaInteres;
import edu.pe.upc.finanzas.finanzasbackend.serviceinterfaces.ITasaInteresService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/tasas-interes")
@CrossOrigin(origins = "*")
public class TasaInteresController {

    private final ITasaInteresService tasaInteresService;

    public TasaInteresController(ITasaInteresService tasaInteresService) {
        this.tasaInteresService = tasaInteresService;
    }


    @GetMapping
    public ResponseEntity<List<TasaInteres>> listarTasasInteres() {
        return ResponseEntity.ok(tasaInteresService.list());
    }

    @PostMapping
    public ResponseEntity<TasaInteres> crearTasaInteres(@RequestBody TasaInteresDTO tasaInteresDTO) {
        TasaInteres tasaInteres = tasaInteresService.create(tasaInteresDTO);
        return ResponseEntity.ok(tasaInteres);
    }
}