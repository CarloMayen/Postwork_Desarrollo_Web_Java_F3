package org.bedu.java.backend.postwork.controllers;

import java.net.URI;
import java.util.List;
import java.util.Optional;

import org.bedu.java.backend.postwork.models.Etapa;
import org.bedu.java.backend.postwork.services.EtapaService;
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
@RequestMapping("etapas")
@RequiredArgsConstructor
public class EtapaController {
    private final EtapaService service;

    @GetMapping("{id}")
    public ResponseEntity<Etapa> getEtapa(@PathVariable("id") Long id) {
        Optional<Etapa> db = service.obtenEtapa(id);
        if (db.isEmpty()) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "La etapa, no existe.");
        }
        return ResponseEntity.ok(db.get());
    }

    @GetMapping
    public ResponseEntity<List<Etapa>> getEtapas() {
        return ResponseEntity.ok(service.obtenEtapas());
    }

    @PostMapping
    public ResponseEntity<Etapa> creaEtapa(@Valid @RequestBody Etapa etapa) {
        Etapa item = service.guardaEtapa(etapa);
        return ResponseEntity.created(URI.create(String.valueOf(item.getId()))).build();
    }

    @PutMapping("{id}")
    public ResponseEntity<Etapa> modificaEtapa(@PathVariable("id") Long id, @Valid @RequestBody Etapa etapa) {
        etapa.setId(id);
        service.actualizaEtapa(etapa);
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }

    @DeleteMapping("{id}")
    public ResponseEntity<Etapa> eliminaEtapa(@PathVariable("id") Long id) {
        service.eliminaEtapa(id);
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }
}
