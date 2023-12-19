package com.example.spring.boot.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.http.HttpStatus;

/*
*  This class is used to send particular data requested from RestResponseEntityExceptionHandler.departmentNotFoundException()
* */

@Data
//@NoArgsConstructor
//@AllArgsConstructor
public class ErrorMessage {
    private HttpStatus status;
    private String message;

    public ErrorMessage() {
    }

    public ErrorMessage(HttpStatus status, String message) {
        this.status = status;
        this.message = message;
    }

    public HttpStatus getStatus() {
        return status;
    }

    public void setStatus(HttpStatus status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "ErrorMessage{" +
                "status=" + status +
                ", message='" + message + '\'' +
                '}';
    }
}
