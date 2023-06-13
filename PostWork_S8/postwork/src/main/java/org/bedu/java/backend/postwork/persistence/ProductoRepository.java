package org.bedu.java.backend.postwork.persistence;

import org.bedu.java.backend.postwork.persistence.models.Producto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductoRepository extends JpaRepository<Producto, Long> {
}