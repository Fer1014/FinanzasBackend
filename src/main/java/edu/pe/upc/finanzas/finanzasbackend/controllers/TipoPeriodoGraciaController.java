package edu.pe.upc.finanzas.finanzasbackend.controllers;

import edu.pe.upc.finanzas.finanzasbackend.entities.TipoPeriodoGracia;
import edu.pe.upc.finanzas.finanzasbackend.serviceinterfaces.ITipoPeriodoGraciaService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/tipos-periodo-gracia")
@CrossOrigin(origins = "*")
public class TipoPeriodoGraciaController {

    private final ITipoPeriodoGraciaService tipoPeriodoGraciaService;

    public TipoPeriodoGraciaController(ITipoPeriodoGraciaService tipoPeriodoGraciaService) {
        this.tipoPeriodoGraciaService = tipoPeriodoGraciaService;
    }

    @GetMapping
    public List<TipoPeriodoGracia> listarTipos() {
        return tipoPeriodoGraciaService.list();
    }
}