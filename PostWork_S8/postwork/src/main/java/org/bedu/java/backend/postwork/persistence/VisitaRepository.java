package org.bedu.java.backend.postwork.persistence;

import org.bedu.java.backend.postwork.persistence.models.Visita;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VisitaRepository extends JpaRepository<Visita, Long> {
}