package org.bedu.java.backend.postwork.models;

import java.time.LocalDate;

import jakarta.validation.constraints.Future;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.PositiveOrZero;
import jakarta.validation.constraints.Size;

public class Visita {
    @PositiveOrZero(message = "ID should be positive")
    private Long id;
    @NotNull(message = "Only should be create a visit with existing client")
    private Cliente client;
    @Future(message = "Schedule date of visit should be created in the future")
    private LocalDate scheduleDate;
    @NotBlank(message = "You should specify an address.")
    private String address;
    @NotBlank(message = "Topic should be specified")
    @Size(min = 15, message = "long should be at least 15 characters")
    private String topic;
    @NotEmpty(message = "Name of seller should not be in blank")
    @Size(min = 4, max = 30, message = "Name should be between 4 and 30 characters")
    private String seller;
}
