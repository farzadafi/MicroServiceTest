package com.MicroServiceTest.customer.exception;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;


@Slf4j
@ControllerAdvice
public class ExceptionHandler {

    @org.springframework.web.bind.annotation.ExceptionHandler(CustomerNotFoundException.class)
    public ResponseEntity<String> customerExceptionHandler(CustomerNotFoundException e) {
        log.warn("This customer not found!");
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(e.getMessage());
    }

}
