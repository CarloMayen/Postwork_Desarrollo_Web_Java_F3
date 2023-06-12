package org.bedu.java.backend.postwork.controllers.mappers;

import org.bedu.java.backend.postwork.persistence.models.Venta;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface VentaMapper {
    Venta ventaModelToVentaEntity(org.bedu.java.backend.postwork.persistence.models.Venta ventaModel);

    org.bedu.java.backend.postwork.persistence.models.Venta ventaEntityToVentaModel(Venta venta);
}