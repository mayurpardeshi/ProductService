package com.scaler.productservice.exceptions;

public class InvalidProductIdException extends Exception {
    private Long productId;
    public InvalidProductIdException(Long productId,String message) {
        super(message);
        this.productId = productId;
    }

    public InvalidProductIdException(String message, Throwable cause) {
        super(message, cause);
    }
}
