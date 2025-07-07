package com.certificacion.SergueiBack.exceptions;

public class ResponseNoFound extends AssertionError{

    public static final String RESPONSE_NO_VALIDA = "El resultado no es el esperado";
    public ResponseNoFound(String message, Throwable cause){super(message, cause);}
}
