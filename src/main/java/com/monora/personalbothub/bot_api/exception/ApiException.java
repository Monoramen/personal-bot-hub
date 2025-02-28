package com.monora.personalbothub.bot_api.exception;

public class ApiException extends RuntimeException {
    public static final long serialVersionUID = 1L;
    private final ApiErrorType errorType;

    public ApiException(ApiErrorType errorType, String errorMessage) {
        super(errorMessage != null ? errorMessage : errorType.getMessage());
        this.errorType = errorType;

    }

    public ApiErrorType getErrorType() {
        return errorType;
    }

    public int getStatusCode() {
        return errorType.getStatus().value();
    }
}
