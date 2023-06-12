package org.bedu.java.backend.postwork.controllers;

import java.util.List;

import org.bedu.java.backend.postwork.models.Etapa;
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
@RequestMapping("etapas")
public class EtapaController {

    @GetMapping("{id}")
    public ResponseEntity<Etapa> getEtapa(@PathVariable("id") Long id) {
        return ResponseEntity.ok().build();
    }

    @GetMapping
    public ResponseEntity<List<Etapa>> getEtapas() {
        return ResponseEntity.ok().build();
    }

    @PostMapping
    public ResponseEntity<Etapa> creaEtapa(@RequestBody Etapa etapa) {
        return ResponseEntity.ok().build();
    }

    @PutMapping("{id}")
    public ResponseEntity<Etapa> modificaEtapa(@PathVariable("id") Long id, @RequestBody Etapa etapa) {
        return ResponseEntity.ok().build();
    }

    @DeleteMapping("{id}")
    public ResponseEntity<Etapa> eliminaEtapa(@PathVariable("id") Long id) {
        return ResponseEntity.ok().build();
    }
}
