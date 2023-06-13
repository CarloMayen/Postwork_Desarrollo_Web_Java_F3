package org.bedu.java.backend.postwork.controllers.mappers;

import org.bedu.java.backend.postwork.persistence.models.Cliente;
import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring", injectionStrategy = InjectionStrategy.CONSTRUCTOR)
public interface ClienteMapper {
    @Mapping(source = "name", target = "nombre")
    @Mapping(source = "email", target = "correoContacto")
    @Mapping(source = "address", target = "direccion")
    @Mapping(source = "numEmployees", target = "numeroEmpleados")
    Cliente clienteModelToClienteEntity(org.bedu.java.backend.postwork.models.Cliente clienteModel);

    @Mapping(source = "nombre", target = "name")
    @Mapping(source = "correoContacto", target = "email")
    @Mapping(source = "direccion", target = "address")
    @Mapping(source = "numeroEmpleados", target = "numEmployees")
    org.bedu.java.backend.postwork.models.Cliente clienteEntityToClienteModel(Cliente cliente);
}