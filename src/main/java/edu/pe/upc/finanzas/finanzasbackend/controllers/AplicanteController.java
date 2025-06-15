package edu.pe.upc.finanzas.finanzasbackend.controllers;

import edu.pe.upc.finanzas.finanzasbackend.entities.Aplicante;
import edu.pe.upc.finanzas.finanzasbackend.serviceinterfaces.IAplicanteService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
    public List<Aplicante> listarAplicantes() {
        return aplicanteService.list();
    }
}