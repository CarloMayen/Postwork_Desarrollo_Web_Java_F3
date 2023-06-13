package org.bedu.java.backend.postwork.handlers;

import org.bedu.java.backend.postwork.models.RespuestaError;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;

@RestControllerAdvice
public class ManejadorGlobalErrores {
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<?> handleStatusExeptiom(MethodArgumentNotValidException e, WebRequest request) {
        return RespuestaError.builder()
                .exception(e)
                .mensaje("Ocurrió un error al validar la información de la petición.")
                .ruta(request.getDescription(false).substring(4))
                .entidad();
    }

    @ExceptionHandler(Exception.class)
    public ResponseEntity<?> manejaException(Exception e, WebRequest request) {
        return RespuestaError.builder()
                .status(HttpStatus.INTERNAL_SERVER_ERROR)
                .mensaje("Ocurrió un error al procesar la petición")
                .ruta(request.getDescription(false).substring(4))
                .entidad();
    }
}
