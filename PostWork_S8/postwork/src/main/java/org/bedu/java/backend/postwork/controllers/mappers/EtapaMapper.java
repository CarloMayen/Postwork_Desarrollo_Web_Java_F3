package org.bedu.java.backend.postwork.controllers.mappers;

import org.bedu.java.backend.postwork.persistence.models.Etapa;
import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring", injectionStrategy = InjectionStrategy.CONSTRUCTOR)
public interface EtapaMapper {
    @Mapping(source = "name", target = "nombre")
    @Mapping(source = "order", target = "orden")
    Etapa etapaModelToEtapaEntity(org.bedu.java.backend.postwork.models.Etapa etapaModel);

    @Mapping(source = "nombre", target = "name")
    @Mapping(source = "orden", target = "order")
    org.bedu.java.backend.postwork.models.Etapa etapaEntityToEtapaModel(Etapa etapa);
}