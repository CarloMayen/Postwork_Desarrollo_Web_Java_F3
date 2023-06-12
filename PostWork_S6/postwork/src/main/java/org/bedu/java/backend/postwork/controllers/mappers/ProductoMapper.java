package org.bedu.java.backend.postwork.controllers.mappers;

import org.bedu.java.backend.postwork.entities.models.Producto;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ProductoMapper {
    Producto productoModelToProductoEntity(org.bedu.java.backend.postwork.entities.models.Producto productoModel);

    org.bedu.java.backend.postwork.entities.models.Producto productoEntityToProductoModel(Producto producto);
}