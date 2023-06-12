package org.bedu.java.backend.postwork.controllers;

import java.util.List;

import org.bedu.java.backend.postwork.models.Cliente;
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
@RequestMapping("clientes")
public class ClienteController {

    @GetMapping("{id}")
    public ResponseEntity<Cliente> getCliente(@PathVariable("id") Long id) {
        return ResponseEntity.ok().build();
    }

    @GetMapping
    public ResponseEntity<List<Cliente>> getClientes() {
        return ResponseEntity.ok().build();
    }

    @PostMapping
    public ResponseEntity<Void> creaCliente(@RequestBody Cliente cliente) {
            return ResponseEntity.ok().build();
    }

    @PutMapping("{id}")
    public ResponseEntity<Void> modificaCliente(@PathVariable("id") Long id, @RequestBody Cliente cliente) {
        return ResponseEntity.ok().build();
    }

    @DeleteMapping("{id}")
    public ResponseEntity<Void> eliminaCliente(@PathVariable("id") Long id) {
        return ResponseEntity.ok().build();
    }
}
