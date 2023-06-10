package org.bedu.java.backend.postwork.controllers;

import java.util.List;

import org.bedu.java.backend.postwork.models.Venta;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("ventas")
public class VentaController {
    @GetMapping("{id}")
    public ResponseEntity<Venta> getVenta(@PathVariable("id") Long id) {
        return ResponseEntity.ok().build();
    }

    @GetMapping
    public ResponseEntity<List<Venta>> getVentas() {
        return ResponseEntity.ok().build();
    }

    @PostMapping
    public ResponseEntity<Venta> creaVenta(@RequestBody Venta venta) {
        return ResponseEntity.ok().build();
    }

    @PutMapping("{id}")
    public ResponseEntity<Venta> modificaVenta(@PathVariable("id") Long id, @RequestBody Venta venta) {
        return ResponseEntity.ok().build();
    }

    @DeleteMapping("{id}")
    public ResponseEntity<Venta> eliminaVenta(@PathVariable("id") Long id) {
        return ResponseEntity.ok().build();
    }
}
