package org.bedu.java.backend.postwork.persistence;

import org.bedu.java.backend.postwork.persistence.models.Etapa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EtapaRepository extends JpaRepository<Etapa, Long> {
}