package edu.pe.upc.finanzas.finanzasbackend.controllers;

import edu.pe.upc.finanzas.finanzasbackend.entities.FrecuenciaCupon;
import edu.pe.upc.finanzas.finanzasbackend.serviceinterfaces.IFrecuenciaCuponService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
    public List<FrecuenciaCupon> listarFrecuencias() {
        return frecuenciaCuponService.list();
    }
}