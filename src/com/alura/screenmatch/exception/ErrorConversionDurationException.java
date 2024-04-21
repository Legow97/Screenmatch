package com.alura.screenmatch.exception;

public class ErrorConversionDurationException extends RuntimeException {
    private String message;
    public ErrorConversionDurationException(String message){
        this.message = message;
    }

    @Override
    public String getMessage(){
        return this.message;
    }
}
