package com.cg.exceptions;

import java.util.Map;

public class ErrorResponse {

    private String message;
    private Map<String, String> fieldErrors;

    // For simple messages
    public ErrorResponse(String message) {
        this.message = message;
    }

    // For field-wise validation errors
    public ErrorResponse(String message, Map<String, String> fieldErrors) {
        this.message = message;
        this.fieldErrors = fieldErrors;
    }

    public String getMessage() { return message; }
    public void setMessage(String message) { this.message = message; }

    public Map<String, String> getFieldErrors() { return fieldErrors; }
    public void setFieldErrors(Map<String, String> fieldErrors) { this.fieldErrors = fieldErrors; }
}