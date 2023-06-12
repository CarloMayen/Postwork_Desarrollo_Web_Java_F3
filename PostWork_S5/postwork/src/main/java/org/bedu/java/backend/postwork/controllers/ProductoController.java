package org.bedu.java.backend.postwork.controllers;

import java.util.List;

import org.bedu.java.backend.postwork.models.Producto;
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
@RequestMapping("productos")
public class ProductoController {
    @GetMapping("{id}")
    public ResponseEntity<Producto> getProducto(@PathVariable("id") Long id) {
        return ResponseEntity.ok().build();
    }

    @GetMapping
    public ResponseEntity<List<Producto>> getProductos() {
        return ResponseEntity.ok().build();
    }

    @PostMapping
    public ResponseEntity<Producto> creaProducto(@RequestBody Producto producto) {
        return ResponseEntity.ok().build();
    }

    @PutMapping("{id}")
    public ResponseEntity<Producto> modificaProducto(@PathVariable("id") Long id, @RequestBody Producto producto) {
        return ResponseEntity.ok().build();
    }

    @DeleteMapping("{id}")
    public ResponseEntity<Producto> eliminaProducto(@PathVariable("id") Long id) {
        return ResponseEntity.ok().build();
    }
}
