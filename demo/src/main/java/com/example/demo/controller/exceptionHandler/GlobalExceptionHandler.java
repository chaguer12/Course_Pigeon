package com.example.demo.controller.exceptionHandler;

import com.example.demo.exception.ErrorInfo;
import com.example.demo.exception.UserAlreadyExists;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(UserAlreadyExists.class)
    public ResponseEntity<ErrorInfo> handleUserAlreadyExists(UserAlreadyExists userAlreadyExists) {
        ErrorInfo errorResponse = new ErrorInfo(HttpStatus.CONFLICT.value(), userAlreadyExists.getMessage());
        return new ResponseEntity<>(errorResponse, HttpStatus.CONFLICT);
    }
}
