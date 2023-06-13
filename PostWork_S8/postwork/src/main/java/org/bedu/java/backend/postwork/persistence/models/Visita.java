package org.bedu.java.backend.postwork.persistence.models;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Table(name = "VISITAS")
@Entity
@NoArgsConstructor
public class Visita {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @ManyToOne
    private Cliente cliente;
    @Column(nullable = false)
    private LocalDateTime fechaProgramada;
    @Column(nullable = false)
    private String direccion;
    @Column(nullable = false)
    private String proposito;
    @Column(nullable = false)
    private String vendedor;
}

