package edu.pe.upc.finanzas.finanzasbackend.controllers;

import edu.pe.upc.finanzas.finanzasbackend.dtos.TipoPeriodoGraciaDTO;
import edu.pe.upc.finanzas.finanzasbackend.entities.TipoPeriodoGracia;
import edu.pe.upc.finanzas.finanzasbackend.serviceinterfaces.ITipoPeriodoGraciaService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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
    public ResponseEntity<List<TipoPeriodoGracia>> listarTipos() {
        return ResponseEntity.ok(tipoPeriodoGraciaService.list());
    }

    @PostMapping
    public ResponseEntity<TipoPeriodoGracia> crearTipo(@RequestBody TipoPeriodoGraciaDTO dto) {
        TipoPeriodoGracia tipo = tipoPeriodoGraciaService.create(dto);
        return ResponseEntity.ok(tipo);
    }
}