package com.mik.smallpowerrest.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.util.Date;

@ControllerAdvice
public class GlobalExceptionHandler {


    @ExceptionHandler
    public ResponseEntity<ServiceError> catchUserNotFoundException(FailAuthorizationException e){
        return new ResponseEntity<>(new ServiceError(HttpStatus.NOT_FOUND.value(), e.getMessage(),new Date()), HttpStatus.NOT_FOUND);
    }


    @ExceptionHandler
    public ResponseEntity<ServiceError> catchFileNotLoadException(FailLoadFileException e){
        return new ResponseEntity<>(new ServiceError(HttpStatus.NOT_FOUND.value(), e.getMessage(), new Date()), HttpStatus.NOT_FOUND);
    }


}
