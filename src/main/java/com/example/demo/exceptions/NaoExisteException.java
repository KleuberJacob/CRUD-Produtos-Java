package com.example.demo.exceptions;

public class NaoExisteException extends RuntimeException {

    public NaoExisteException(String message) {
        super(message);
    }

}
