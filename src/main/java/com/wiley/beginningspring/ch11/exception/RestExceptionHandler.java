package com.wiley.beginningspring.ch11.exception;

import com.wiley.beginningspring.ch11.Model.RestErrorMessage;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.ServletWebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import static org.springframework.http.MediaType.APPLICATION_JSON;

@ControllerAdvice
public class RestExceptionHandler extends ResponseEntityExceptionHandler {
    @ExceptionHandler(Exception.class)
    protected ResponseEntity<Object> handleInvalidRequest(RestException restException, ServletWebRequest request){
        RestErrorMessage error = new RestErrorMessage(HttpStatus.NOT_FOUND, restException.getCode(), restException.getMessage(), restException.getDetailedMessage(), restException.toString());
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(APPLICATION_JSON);
        return handleExceptionInternal(restException, error, headers, HttpStatus.OK, request);
    }
}
