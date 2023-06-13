package org.bedu.java.backend.postwork.controllers;

import java.net.URI;
import java.util.List;
import java.util.Optional;

import org.bedu.java.backend.postwork.models.Cliente;
import org.bedu.java.backend.postwork.services.ClienteService;
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
@RequestMapping("clientes")
@RequiredArgsConstructor
public class ClienteController {
    private final ClienteService service;

    @GetMapping("{id}")
    public ResponseEntity<Cliente> getCliente(@PathVariable("id") Long id) {
        Optional<Cliente> db = service.obtenCliente(id);
        if (db.isEmpty()) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "El cliente, no existe.");
        }
        return ResponseEntity.ok(db.get());
    }

    @GetMapping
    public ResponseEntity<List<Cliente>> getClientes() {
        return ResponseEntity.ok(service.obtenClientes());
    }

    @PostMapping
    public ResponseEntity<Void> creaCliente(@Valid @RequestBody Cliente cliente) {
        Cliente item = service.guardaCliente(cliente);
        return ResponseEntity.created(URI.create(String.valueOf(item.getId()))).build();
    }

    @PutMapping("{id}")
    public ResponseEntity<Void> actualizaCliente(@PathVariable("id") Long id, @RequestBody @Valid Cliente cliente) {
        cliente.setId(id);
        service.actualizaCliente(cliente);
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }

    @DeleteMapping("{id}")
    public ResponseEntity<Void> eliminaCliente(@PathVariable("id") Long id) {
        service.eliminaCliente(id);
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }
}

