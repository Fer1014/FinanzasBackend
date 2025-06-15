package edu.pe.upc.finanzas.finanzasbackend.controllers;

import edu.pe.upc.finanzas.finanzasbackend.entities.TasaInteres;
import edu.pe.upc.finanzas.finanzasbackend.serviceinterfaces.ITasaInteresService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
    public List<TasaInteres> listarTasas() {
        return tasaInteresService.list();
    }
}