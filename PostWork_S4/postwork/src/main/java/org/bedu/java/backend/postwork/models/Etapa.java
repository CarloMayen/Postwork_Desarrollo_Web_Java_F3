package org.bedu.java.backend.postwork.models;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.PositiveOrZero;

public class Etapa {
    @PositiveOrZero(message = "ID should be positive")
    private Long id;
    @NotBlank(message = "Name is required")
    private String name;
    @Positive(message = "Order should be positive and higher than 0")
    private int order;
}
