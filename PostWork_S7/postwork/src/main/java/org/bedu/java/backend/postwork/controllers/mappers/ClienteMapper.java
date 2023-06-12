package org.bedu.java.backend.postwork.controllers.mappers;

import org.bedu.java.backend.postwork.persistence.models.Cliente;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ClienteMapper {
    Cliente clienteModelToClienteEntity(org.bedu.java.backend.postwork.persistence.models.Cliente clienteModel);

    org.bedu.java.backend.postwork.persistence.models.Cliente clienteEntityToClienteModel(Cliente cliente);
}