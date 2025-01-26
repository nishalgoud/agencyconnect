package com.agencyconnect.api.exception;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ProblemDetail;
import org.springframework.web.ErrorResponse;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(IllegalArgumentException.class)
    public ProblemDetail handleIllegalArgumentException(IllegalArgumentException exception) {
        return ProblemDetail.forStatusAndDetail(HttpStatus.BAD_REQUEST, exception.getMessage());
    }

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ProblemDetail handleMethodArgumentNotValidException(
            MethodArgumentNotValidException exception) {
        ProblemDetail validationProblemDetail = ProblemDetail.forStatusAndDetail(
                HttpStatus.BAD_REQUEST,  "Validation error"
    );

        List<ConstraintViolation> errors = exception.getFieldErrors()
                .stream()
                .map(violation -> ConstraintViolation.builder()
                        .message(violation.getDefaultMessage())
                        .fieldName(violation.getField())
                        .rejectedValue(
                                Objects.isNull(violation.getRejectedValue()) ?
                                        "null" : violation.getRejectedValue().toString()
                        )
                        .build()
                )
                .collect(Collectors.toList());

        validationProblemDetail.setProperty("errors", errors);
        return validationProblemDetail;
    }

    @ExceptionHandler(Exception.class)
    public ErrorResponse handleAllExceptions(Exception exception) {

        return ErrorResponse.builder(exception, HttpStatus.INTERNAL_SERVER_ERROR,exception.getMessage()).build();
    }

}
