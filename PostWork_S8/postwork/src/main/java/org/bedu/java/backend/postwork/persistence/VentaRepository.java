package org.bedu.java.backend.postwork.persistence;

import org.bedu.java.backend.postwork.persistence.models.Venta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VentaRepository extends JpaRepository<Venta, Long> {
}