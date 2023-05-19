package org.example;

public class IdadeException extends RuntimeException{
    @Override
    public String getMessage() {
        return "Idade inválida";
    }
}
