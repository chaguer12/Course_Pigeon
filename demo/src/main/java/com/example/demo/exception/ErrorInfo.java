package com.example.demo.exception;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ErrorInfo {
    private int status;
    private String message;
    private long timestamp;

    public ErrorInfo(int status, String message, long timestamp) {
        this.status = status;
        this.message = message;
        this.timestamp = timestamp;
    }
}
