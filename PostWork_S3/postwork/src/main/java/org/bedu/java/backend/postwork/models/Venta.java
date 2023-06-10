package org.bedu.java.backend.postwork.models;

import java.time.LocalDate;
import java.util.List;

import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.PastOrPresent;
import jakarta.validation.constraints.PositiveOrZero;

public class Venta {
    @PositiveOrZero(message = "ID should be positive")
    private Long id;
    @DecimalMin(value = "1.00", inclusive = true, message = "Value of product should be at least 1.00")
    private float amount;
    @NotEmpty(message = "There should be at least one product")
    private List<Producto> products;
    @NotNull(message = "Only should be create a sell with existing client")
    private Cliente client;
    @PastOrPresent(message = "Date of creation should be current date or earlier date")
    private LocalDate created;
}
