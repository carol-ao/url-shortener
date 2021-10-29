package com.demo.urlshortener.services.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import javax.servlet.http.HttpServletRequest;
import java.time.Instant;

@ControllerAdvice
public class ResourceExceptionHandler {

    @ExceptionHandler(ResourceNotFoundException.class)
    public ResponseEntity<StandardError> resourceNotFound(ResourceNotFoundException r, HttpServletRequest httpServletRequest){
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(
                StandardError.builder()
                        .timestamp(Instant.now())
                        .status(HttpStatus.NOT_FOUND.value())
                        .message(r.getMessage())
                        .error("Resource not found")
                        .path(httpServletRequest.getRequestURI())
                        .build());
    }

    @ExceptionHandler(DuplicateUrlException.class)
    public ResponseEntity<StandardError> duplicateUrlException(DuplicateUrlException r, HttpServletRequest httpServletRequest){
        return ResponseEntity.status(HttpStatus.FORBIDDEN).body(
                StandardError.builder()
                        .timestamp(Instant.now())
                        .status(HttpStatus.FORBIDDEN.value())
                        .message(r.getMessage())
                        .error("This Url has already been saved. Cannot save duplicate.")
                        .path(httpServletRequest.getRequestURI())
                        .build());
    }
}
