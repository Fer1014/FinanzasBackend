package edu.pe.upc.finanzas.finanzasbackend.controllers;

import edu.pe.upc.finanzas.finanzasbackend.entities.Moneda;
import edu.pe.upc.finanzas.finanzasbackend.serviceinterfaces.IMonedaService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
    public List<Moneda> listarMonedas() {
        return monedaService.list();
    }
}