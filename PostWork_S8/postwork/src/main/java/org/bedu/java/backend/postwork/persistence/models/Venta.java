package org.bedu.java.backend.postwork.persistence.models;

import java.time.LocalDateTime;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Table(name = "VENTAS")
@Entity
@NoArgsConstructor
public class Venta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private float monto;
    @OneToMany
    private List<Producto> productos;
    @ManyToOne
    private Cliente cliente;
    @Column(nullable = false)
    private LocalDateTime fechaCreacion;
}
