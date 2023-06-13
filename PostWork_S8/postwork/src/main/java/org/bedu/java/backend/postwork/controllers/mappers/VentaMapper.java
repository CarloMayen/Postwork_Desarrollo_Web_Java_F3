package org.bedu.java.backend.postwork.controllers.mappers;

import org.bedu.java.backend.postwork.persistence.models.Venta;
import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring", injectionStrategy = InjectionStrategy.CONSTRUCTOR)
public interface VentaMapper {
    @Mapping(source = "client", target = "cliente")
    @Mapping(source = "amount", target = "monto")
    @Mapping(source = "products", target = "productos")
    @Mapping(source = "created", target = "fechaCreacion")
    Venta ventaModelToVentaEntity(org.bedu.java.backend.postwork.models.Venta ventaModel);

    @Mapping(source = "cliente", target = "client")
    @Mapping(source = "monto", target = "amount")
    @Mapping(source = "productos", target = "products")
    @Mapping(source = "fechaCreacion", target = "created")
    org.bedu.java.backend.postwork.models.Venta ventaEntityToVentaModel(Venta venta);
}