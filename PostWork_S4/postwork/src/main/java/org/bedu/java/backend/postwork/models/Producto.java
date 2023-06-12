package org.bedu.java.backend.postwork.models;

import java.time.LocalDate;

import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.PastOrPresent;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.PositiveOrZero;

public class Producto {
    @PositiveOrZero(message = "ID should be positive")
    private Long id;
    @NotBlank(message = "Name is required")
    private String name;
    private String category;
    @DecimalMin(value = "1.00", inclusive = true, message = "Value of product should be at least 1.00")
    private float price;
    @NotEmpty(message = "Register number is required")
    @Pattern(regexp = "^(\\d{3}[-]?){2}\\d{4}$")
    private String register;
    @PastOrPresent(message = "Date of creation should be current date or earlier date")
    private LocalDate created;
}
