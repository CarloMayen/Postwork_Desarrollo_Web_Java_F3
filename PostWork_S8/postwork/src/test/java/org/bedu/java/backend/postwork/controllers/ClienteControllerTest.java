package org.bedu.java.backend.postwork.controllers;

import com.fasterxml.jackson.databind.ObjectMapper;

import org.bedu.java.backend.postwork.models.Cliente;
import org.bedu.java.backend.postwork.services.ClienteService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.restdocs.AutoConfigureRestDocs;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.restdocs.mockmvc.MockMvcRestDocumentation;
import org.springframework.restdocs.payload.PayloadDocumentation;
import org.springframework.test.web.servlet.MockMvc;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import static org.hamcrest.Matchers.is;
import static org.mockito.ArgumentMatchers.anyLong;
import static org.mockito.BDDMockito.given;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@AutoConfigureMockMvc
@AutoConfigureRestDocs()
@WebMvcTest(ClienteController.class)
class ClienteControllerTest {

        @Autowired
        private MockMvc mockMvc;

        @MockBean
        private ClienteService clienteService;

        @Test
        void getCliente() throws Exception {
                given(clienteService.obtenCliente(anyLong()))
                                .willReturn(Optional.of(Cliente.builder().id(1L).name("Nombre")
                                                .email("cliente@contacto.com").address("Dirección").numEmployees("15").build()));

                mockMvc.perform(get("/clientes/1")
                                .content(MediaType.APPLICATION_JSON_VALUE))
                                .andExpect(status().isOk())
                                .andExpect(content().contentTypeCompatibleWith(MediaType.APPLICATION_JSON))
                                .andExpect(jsonPath("$.id", is(1)))
                                .andExpect(jsonPath("$.email", is("cliente@contacto.com")))
                                .andExpect(jsonPath("$.name", is("Nombre")))
                                .andExpect(jsonPath("$.address", is("Dirección")))
                                .andExpect(jsonPath("$.numEmployees", is("15")))
                                .andDo(MockMvcRestDocumentation.document("clientes/findById"));
        }

        @Test
        void getClientes() throws Exception {

                List<Cliente> clientes = Arrays.asList(
                                Cliente.builder().id(1L).name("Nombre 1").address("Direccion 1").numEmployees("10")
                                                .email("contacto@cliente1.com").build(),
                                Cliente.builder().id(2L).name("Nombre 2").address("Direccion 2").numEmployees("10")
                                                .email("contacto@cliente2.com").build(),
                                Cliente.builder().id(3L).name("Nombre 3").address("Direccion 3").numEmployees("10")
                                                .email("contacto@cliente3.com").build());

                given(clienteService.obtenClientes()).willReturn(clientes);

                mockMvc.perform(get("/clientes")
                                .content(MediaType.APPLICATION_JSON_VALUE))
                                .andExpect(status().isOk())
                                .andExpect(content().contentTypeCompatibleWith(MediaType.APPLICATION_JSON))
                                .andExpect(jsonPath("$[0].id", is(1)))
                                .andExpect(jsonPath("$[1].id", is(2)))
                                .andExpect(jsonPath("$[2].id", is(3)))
                                .andExpect(jsonPath("$[0].email", is("contacto@cliente1.com")))
                                .andExpect(jsonPath("$[2].name", is("Nombre 3")))
                                .andDo(MockMvcRestDocumentation.document("clientes/findAll"));
        }

        @Test
        void creaCliente() throws Exception {
                Cliente clienteParametro = Cliente.builder().name("Nombre").address("Direccion").numEmployees("10")
                                .email("contacto@cliente.com").build();
                Cliente clienteRespuesta = Cliente.builder().id(1L).name("Nombre").address("Direccion")
                                .numEmployees("10")
                                .email("contacto@cliente.com").build();

                given(clienteService.guardaCliente(clienteParametro)).willReturn(clienteRespuesta);

                mockMvc.perform(post("/clientes")
                                .contentType(MediaType.APPLICATION_JSON)
                                .content(new ObjectMapper().writeValueAsString(clienteParametro)))
                                .andExpect(status().isCreated())
                                .andDo(MockMvcRestDocumentation.document("clientes/create"));;
        }

        @Test
        void actualizaCliente() throws Exception {

                Cliente clienteParametro = Cliente.builder().id(1L).name("Nombre").address("Direccion")
                                .numEmployees("10")
                                .email("contacto@cliente.com").build();

                mockMvc.perform(put("/clientes/1")
                                .contentType(MediaType.APPLICATION_JSON)
                                .content(new ObjectMapper().writeValueAsString(clienteParametro)))
                                .andExpect(status().isNoContent())
                                .andDo(MockMvcRestDocumentation.document("clientes/update"));
        }

        @Test
        void eliminaCliente() throws Exception {
                mockMvc.perform(delete("/clientes/1")
                                .content(MediaType.APPLICATION_JSON_VALUE))
                                .andExpect(status().isNoContent())
                                .andDo(MockMvcRestDocumentation.document("clientes/delete"));
        }
}