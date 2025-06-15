package edu.pe.upc.finanzas.finanzasbackend.controllers;

import edu.pe.upc.finanzas.finanzasbackend.entities.DiasAnio;
import edu.pe.upc.finanzas.finanzasbackend.serviceinterfaces.IDiasAnioService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
    public List<DiasAnio> listarDiasAnio() {
        return diasAnioService.list();
    }
}