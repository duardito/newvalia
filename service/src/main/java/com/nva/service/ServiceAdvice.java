package com.nva.service;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by edu on 31/12/2014.
 */
@ControllerAdvice
public class ServiceAdvice {

    @ExceptionHandler(ServiceErrors.class)
    @ResponseBody
    public ResponseEntity serviceException(final ServiceErrors serviceErrors){
        return new ResponseEntity(HttpStatus.FORBIDDEN);
    }


}
