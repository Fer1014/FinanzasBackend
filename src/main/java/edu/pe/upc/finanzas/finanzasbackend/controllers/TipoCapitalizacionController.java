package edu.pe.upc.finanzas.finanzasbackend.controllers;

import edu.pe.upc.finanzas.finanzasbackend.entities.TipoCapitalizacion;
import edu.pe.upc.finanzas.finanzasbackend.serviceinterfaces.ITipoCapitalizacionService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/tipos-capitalizacion")
@CrossOrigin(origins = "*")
public class TipoCapitalizacionController {

    private final ITipoCapitalizacionService tipoCapitalizacionService;

    public TipoCapitalizacionController(ITipoCapitalizacionService tipoCapitalizacionService) {
        this.tipoCapitalizacionService = tipoCapitalizacionService;
    }

    @GetMapping
    public List<TipoCapitalizacion> listarTipos() {
        return tipoCapitalizacionService.list();
    }
}