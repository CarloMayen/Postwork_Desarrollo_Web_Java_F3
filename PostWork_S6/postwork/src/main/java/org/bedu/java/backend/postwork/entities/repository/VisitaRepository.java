package org.bedu.java.backend.postwork.entities.repository;

import org.springframework.stereotype.Repository;
import org.bedu.java.backend.postwork.entities.models.Visita;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface VisitaRepository extends JpaRepository<Visita, Long> {
}