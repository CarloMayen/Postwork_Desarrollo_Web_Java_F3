package org.bedu.java.backend.postwork.controllers;

import java.net.URI;
import java.util.List;
import java.util.Optional;

import org.bedu.java.backend.postwork.models.Producto;
import org.bedu.java.backend.postwork.services.ProductoService;
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
@RequestMapping("productos")
@RequiredArgsConstructor
public class ProductoController {
    private final ProductoService service;

    @GetMapping("{id}")
    public ResponseEntity<Producto> getProducto(@PathVariable("id") Long id) {
        Optional<Producto> db = service.obtenProducto(id);
        if (db.isEmpty()) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "El producto, no existe.");
        }
        return ResponseEntity.ok(db.get());
    }

    @GetMapping
    public ResponseEntity<List<Producto>> getProductos() {
        return ResponseEntity.ok(service.obtenProductos());
    }

    @PostMapping
    public ResponseEntity<Producto> creaProducto(@Valid @RequestBody Producto producto) {
        Producto item = service.guardaProducto(producto);
        return ResponseEntity.created(URI.create(String.valueOf(item.getId()))).build();
    }

    @PutMapping("{id}")
    public ResponseEntity<Producto> modificaProducto(@PathVariable("id") Long id, @Valid @RequestBody Producto producto) {
        producto.setId(id);
        service.actualizaProducto(producto);
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }

    @DeleteMapping("{id}")
    public ResponseEntity<Producto> eliminaProducto(@PathVariable("id") Long id) {
        service.eliminaProducto(id);
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }
}
