package org.bedu.java.backend.postwork.controllers.mappers;

import org.bedu.java.backend.postwork.entities.models.Visita;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface VisitaMapper {
    Visita visitaModelToVisitaEntity(org.bedu.java.backend.postwork.entities.models.Visita visitaModel);

    org.bedu.java.backend.postwork.entities.models.Visita visitaEntityToVisitaModel(Visita visita);
}