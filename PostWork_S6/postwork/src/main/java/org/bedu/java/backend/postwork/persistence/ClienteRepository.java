package org.bedu.java.backend.postwork.persistence;

import org.bedu.java.backend.postwork.persistence.entities.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Long> {
}