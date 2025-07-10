package edu.pe.upc.finanzas.finanzasbackend.controllers;

import edu.pe.upc.finanzas.finanzasbackend.dtos.DetalleBonoDTO;
import edu.pe.upc.finanzas.finanzasbackend.entities.DetalleBono;
import edu.pe.upc.finanzas.finanzasbackend.serviceinterfaces.IDetalleBonoService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api/bono/{bonoId}/detalle-bono")
@CrossOrigin
public class DetalleBonoController {

    private final IDetalleBonoService detalleBonoService;

    public DetalleBonoController(IDetalleBonoService detalleBonoService) { this.detalleBonoService = detalleBonoService; }

    @GetMapping
    @Operation(summary = "Listar detalles de bono por ID de bono")
    @ApiResponses(value={
            @ApiResponse(responseCode = "200", description = "Detalles de bono encontrados"),
            @ApiResponse(responseCode = "404", description = "Detalles de bono no encontrados")
    })
    public ResponseEntity<List<DetalleBono>> getDetalleBono(@PathVariable Long bonoId){
        List<DetalleBono> detalles = detalleBonoService.findallByBonoId(bonoId);
        if (detalles.isEmpty()) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(detalles);
    }

    @PostMapping
    public ResponseEntity<DetalleBono> crearDetalleBono(@RequestBody DetalleBonoDTO detalleBonoDTO){
        DetalleBono detalleBonoCreado = detalleBonoService.create(detalleBonoDTO);
        return ResponseEntity.ok(detalleBonoCreado);
    }
}
