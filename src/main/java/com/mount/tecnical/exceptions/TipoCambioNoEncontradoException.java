package com.mount.tecnical.exceptions;

public class TipoCambioNoEncontradoException extends RuntimeException{
    
    public TipoCambioNoEncontradoException() {
        super("Tipo de cambio no encontrado.");
    }

    public TipoCambioNoEncontradoException(String message) {
        super(message);
    }

    public TipoCambioNoEncontradoException(String message, Throwable cause) {
        super(message, cause);
    }

}
