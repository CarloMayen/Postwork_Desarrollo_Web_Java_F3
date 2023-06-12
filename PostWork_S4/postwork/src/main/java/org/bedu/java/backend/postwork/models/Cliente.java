package org.bedu.java.backend.postwork.models;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.PositiveOrZero;

public class Cliente {
    @PositiveOrZero(message = "ID should be positive")
    private Long id;
    @NotBlank(message = "Name is required")
    private String name;
    @Email(message = "You should add a valid email address")
    private String email;
    @Min(value = 10, message = "Minimum number of employees should be at least 10")
    @Max(value = 10000, message = "Maximum number of employees should be at most 10000")
    private String numEmployees;
    @NotBlank(message = "You should specify an address.")
    private String address;
}