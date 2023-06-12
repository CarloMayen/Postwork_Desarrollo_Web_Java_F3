package org.bedu.java.backend.postwork.persistence;

import org.bedu.java.backend.postwork.persistence.entities.Etapa;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface EtapaRepository extends JpaRepository<Etapa, Long> {
}