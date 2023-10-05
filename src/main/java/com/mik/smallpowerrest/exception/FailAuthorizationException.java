package com.mik.smallpowerrest.exception;


public class FailAuthorizationException extends RuntimeException {

    public FailAuthorizationException(String message) {
        super(message);
    }
}
