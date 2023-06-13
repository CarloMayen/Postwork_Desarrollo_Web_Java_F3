package org.bedu.java.backend.postwork.controllers.mappers;

import org.bedu.java.backend.postwork.persistence.models.Visita;
import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring", injectionStrategy = InjectionStrategy.CONSTRUCTOR)
public interface VisitaMapper {
    @Mapping(source = "address", target = "direccion")
    @Mapping(source = "client", target = "cliente")
    @Mapping(source = "scheduleDate", target = "fechaProgramada")
    @Mapping(source = "topic", target = "proposito")
    @Mapping(source = "seller", target = "vendedor")
    Visita visitaModelToVisitaEntity(org.bedu.java.backend.postwork.models.Visita visitaModel);

    @Mapping(source = "direccion", target = "address")
    @Mapping(source = "cliente", target = "client")
    @Mapping(source = "fechaProgramada", target = "scheduleDate")
    @Mapping(source = "proposito", target = "topic")
    @Mapping(source = "vendedor", target = "seller")
    org.bedu.java.backend.postwork.models.Visita visitaEntityToVisitaModel(Visita visita);
}