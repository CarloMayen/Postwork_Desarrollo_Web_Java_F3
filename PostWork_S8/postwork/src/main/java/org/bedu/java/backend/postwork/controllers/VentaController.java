package org.bedu.java.backend.postwork.controllers;

import java.net.URI;
import java.util.List;
import java.util.Optional;

import org.bedu.java.backend.postwork.models.Venta;
import org.bedu.java.backend.postwork.services.VentaService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("ventas")
@RequiredArgsConstructor
public class VentaController {
    private final VentaService service;

    @GetMapping("{id}")
    public ResponseEntity<Venta> getVenta(@PathVariable("id") Long id) {
        Optional<Venta> db = service.obtenVenta(id);
        if (db.isEmpty()) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "La venta, no existe.");
        }
        return ResponseEntity.ok(db.get());
    }

    @GetMapping
    public ResponseEntity<List<Venta>> getVentas() {
        return ResponseEntity.ok(service.obtenVentas());
    }

    @PostMapping
    public ResponseEntity<Venta> creaVenta(@Valid @RequestBody Venta venta) {
        Venta item = service.guardaVenta(venta);
        return ResponseEntity.created(URI.create(String.valueOf(item.getId()))).build();
    }

    @PutMapping("{id}")
    public ResponseEntity<Venta> modificaVenta(@PathVariable("id") Long id, @Valid @RequestBody Venta venta) {
        venta.setId(id);
        service.actualizaVenta(venta);
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }

    @DeleteMapping("{id}")
    public ResponseEntity<Venta> eliminaVenta(@PathVariable("id") Long id) {
        service.eliminaVenta(id);
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }
}
