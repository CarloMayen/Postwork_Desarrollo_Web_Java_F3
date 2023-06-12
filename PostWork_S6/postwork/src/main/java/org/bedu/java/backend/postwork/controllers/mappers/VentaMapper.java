package org.bedu.java.backend.postwork.controllers.mappers;

import org.bedu.java.backend.postwork.entities.models.Venta;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface VentaMapper {
    Venta ventaModelToVentaEntity(org.bedu.java.backend.postwork.entities.models.Venta ventaModel);

    org.bedu.java.backend.postwork.entities.models.Venta ventaEntityToVentaModel(Venta venta);
}