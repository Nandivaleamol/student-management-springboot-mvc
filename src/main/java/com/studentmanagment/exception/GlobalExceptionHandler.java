package com.studentmanagment.exception;

import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ProblemDetail;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(RuntimeException.class)
    public ProblemDetail onException(RuntimeException exception){
        var problemDetail = ProblemDetail.forStatus(HttpStatusCode.valueOf(404));
        problemDetail.setStatus(404);
        problemDetail.setTitle("Not Found");
        problemDetail.setDetail(exception.getMessage());

        return problemDetail;
    }
}
