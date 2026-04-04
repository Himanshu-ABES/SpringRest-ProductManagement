package com.cg.exceptions;

import java.util.Map;

public class ProductValidException extends RuntimeException {
    private final Map<String, String> errors;

    public ProductValidException(Map<String, String> errors) {
        super("Validation failed");
        this.errors = errors;
    }

    public Map<String, String> getErrors() {
        return errors;
    }
}