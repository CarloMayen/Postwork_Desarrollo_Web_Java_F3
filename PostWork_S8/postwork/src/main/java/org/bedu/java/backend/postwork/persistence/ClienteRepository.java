package org.bedu.java.backend.postwork.persistence;

import org.bedu.java.backend.postwork.persistence.models.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Long> {
}