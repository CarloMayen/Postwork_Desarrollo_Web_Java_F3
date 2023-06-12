package org.bedu.java.backend.postwork.controllers.mappers;


import org.bedu.java.backend.postwork.entities.models.Cliente;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ClienteMapper {
    Cliente clienteModelToClienteEntity(org.bedu.java.backend.postwork.entities.models.Cliente clienteModel);

    org.bedu.java.backend.postwork.entities.models.Cliente clienteEntityToClienteModel(Cliente cliente);
}