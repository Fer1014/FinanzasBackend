package edu.pe.upc.finanzas.finanzasbackend.controllers;

import edu.pe.upc.finanzas.finanzasbackend.dtos.TipoCapitalizacionDTO;
import edu.pe.upc.finanzas.finanzasbackend.entities.TipoCapitalizacion;
import edu.pe.upc.finanzas.finanzasbackend.serviceinterfaces.ITipoCapitalizacionService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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
    public ResponseEntity<List<TipoCapitalizacion>> listarTipos() {
        return ResponseEntity.ok(tipoCapitalizacionService.list());
    }

    @PostMapping
    public ResponseEntity<TipoCapitalizacion> crearTipo(@RequestBody TipoCapitalizacionDTO dto) {
        TipoCapitalizacion tipoPeriodo = tipoCapitalizacionService.create(dto);
        return ResponseEntity.ok(tipoPeriodo);
    }
}