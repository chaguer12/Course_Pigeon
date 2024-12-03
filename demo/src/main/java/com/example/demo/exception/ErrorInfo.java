package com.example.demo.exception;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ErrorInfo {
    private int status;
    private String message;

    public ErrorInfo(int status, String message) {
        this.status = status;
        this.message = message;
    }
}
