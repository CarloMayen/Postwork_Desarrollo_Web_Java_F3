package org.bedu.java.backend.postwork.controllers.mappers;

import org.bedu.java.backend.postwork.persistence.models.Producto;
import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring", injectionStrategy = InjectionStrategy.CONSTRUCTOR)
public interface ProductoMapper {
    @Mapping(source = "name", target = "nombre")
    @Mapping(source = "price", target = "precio")
    @Mapping(source = "category", target = "categoria")
    @Mapping(source = "created", target = "fechaCreacion")
    @Mapping(source = "register", target = "numeroRegistro")
    Producto productoModelToProductoEntity(org.bedu.java.backend.postwork.models.Producto productoModel);

    @Mapping(source = "nombre", target = "name")
    @Mapping(source = "precio", target = "price")
    @Mapping(source = "categoria", target = "category")
    @Mapping(source = "fechaCreacion", target = "created")
    @Mapping(source = "numeroRegistro", target = "register")
    org.bedu.java.backend.postwork.models.Producto productoEntityToProductoModel(Producto producto);
}