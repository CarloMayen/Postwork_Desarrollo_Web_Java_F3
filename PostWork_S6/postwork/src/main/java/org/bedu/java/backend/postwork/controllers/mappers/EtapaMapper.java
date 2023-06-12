package org.bedu.java.backend.postwork.controllers.mappers;


import org.bedu.java.backend.postwork.entities.models.Etapa;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface EtapaMapper {
    Etapa etapaModelToEtapaEntity(org.bedu.java.backend.postwork.entities.models.Etapa etapaModel);

    org.bedu.java.backend.postwork.entities.models.Etapa etapaEntityToEtapaModel(Etapa etapa);
}