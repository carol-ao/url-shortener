package com.demo.urlshortener.services.exceptions;

import lombok.Builder;
import lombok.Data;

import java.time.Instant;

@Data
@Builder
public class StandardError {
    private Instant timestamp;
    private Integer status;
    private String message;
    private String error;
    private String path;

}
