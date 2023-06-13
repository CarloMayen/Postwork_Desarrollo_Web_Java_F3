package org.bedu.java.backend.postwork.controllers;

import java.net.URI;
import java.util.List;
import java.util.Optional;

import org.bedu.java.backend.postwork.models.Visita;
import org.bedu.java.backend.postwork.services.VisitaService;
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
@RequestMapping("visitas")
@RequiredArgsConstructor
public class VisitaController {
    private final VisitaService service;

    @GetMapping("{id}")
    public ResponseEntity<Visita> getVisita(@PathVariable("id") Long id) {
        Optional<Visita> db = service.obtenVisita(id);
        if (db.isEmpty()) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "La visita, no existe.");
        }
        return ResponseEntity.ok(db.get());
    }

    @GetMapping
    public ResponseEntity<List<Visita>> getVisitas() {
        return ResponseEntity.ok(service.obtenVisitas());
    }

    @PostMapping
    public ResponseEntity<Visita> creaVisita(@Valid @RequestBody Visita visita) {
        Visita item = service.guardaVisita(visita);
        return ResponseEntity.created(URI.create(String.valueOf(item.getId()))).build();
    }

    @PutMapping("{id}")
    public ResponseEntity<Visita> modificaVisita(@PathVariable("id") Long id, @Valid @RequestBody Visita visita) {
        visita.setId(id);
        service.actualizaVisita(visita);
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }

    @DeleteMapping("{id}")
    public ResponseEntity<Visita> eliminaVisita(@PathVariable("id") Long id) {
        service.eliminaVisita(id);
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }
}
