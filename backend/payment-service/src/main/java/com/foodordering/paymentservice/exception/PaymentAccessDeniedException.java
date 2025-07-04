package com.foodordering.paymentservice.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.FORBIDDEN)
public class PaymentAccessDeniedException extends RuntimeException {

    public PaymentAccessDeniedException(String message) {
        super(message);
    }
}
