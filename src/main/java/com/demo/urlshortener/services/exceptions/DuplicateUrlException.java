package com.demo.urlshortener.services.exceptions;

public class DuplicateUrlException extends RuntimeException {

    public DuplicateUrlException(String msg){
        super(msg);
    }
}
