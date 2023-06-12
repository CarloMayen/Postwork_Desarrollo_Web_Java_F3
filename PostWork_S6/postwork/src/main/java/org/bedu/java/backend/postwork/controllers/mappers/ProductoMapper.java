package org.bedu.java.backend.postwork.controllers.mappers;

import org.bedu.java.backend.postwork.persistence.models.Producto;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ProductoMapper {
    Producto productoModelToProductoEntity(org.bedu.java.backend.postwork.persistence.models.Producto productoModel);

    org.bedu.java.backend.postwork.persistence.models.Producto productoEntityToProductoModel(Producto producto);
}