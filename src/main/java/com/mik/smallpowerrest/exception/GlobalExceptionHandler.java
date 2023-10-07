package com.mik.smallpowerrest.exception;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.util.Date;

@ControllerAdvice
public class GlobalExceptionHandler {

    private static final Logger logger = LoggerFactory.getLogger(GlobalExceptionHandler.class);

    @ExceptionHandler(FailAuthorizationException.class)
    public ResponseEntity<ServiceError> catchUserNotFoundException(FailAuthorizationException e){
        logger.error("Произошла ошибка при работе REST сервиса: {}", e.getMessage());
        return new ResponseEntity<>(new ServiceError(HttpStatus.NOT_FOUND.value(), e.getMessage(),new Date()), HttpStatus.NOT_FOUND);
    }


    @ExceptionHandler(FailLoadFileException.class)
    public ResponseEntity<ServiceError> catchFileNotLoadException(FailLoadFileException e){
        logger.error("Произошла ошибка при работе REST сервиса: {}", e.getMessage());
        return new ResponseEntity<>(new ServiceError(HttpStatus.NOT_FOUND.value(), e.getMessage(), new Date()), HttpStatus.NOT_FOUND);
    }


}
