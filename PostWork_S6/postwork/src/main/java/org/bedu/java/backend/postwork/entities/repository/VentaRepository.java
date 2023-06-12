package org.bedu.java.backend.postwork.entities.repository;

import org.springframework.stereotype.Repository;
import org.bedu.java.backend.postwork.entities.models.Venta;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface VentaRepository extends JpaRepository<Venta, Long> {
}