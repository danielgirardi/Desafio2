package com.south.danielgirardiweb.resources.exceptions;


import com.south.danielgirardiweb.service.exceptions.ProdcutNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import javax.servlet.http.HttpServletRequest;
import java.time.LocalDateTime;

@ControllerAdvice
public class ResourceExceptionHandler {
//
//
//    // https://www.youtube.com/watch?v=o1b5Gemtqrk&list=PLA8Qj9w4RGkWgyYa485pgf-VAoJgL4rW1&index=8
//    //tratando a Exception
//    @ExceptionHandler(ProdcutNotFoundException.class)
//    public ResponseEntity<StandardError>ProductNotFound(ProductNotFoundException ex, HttpServletRequest){
//        StandardError error = new StandardError(LocalDateTime.now(), HttpStatus.NOT_FOUND.value(), ex.getMessage(), request.getRequestURI());
//    return ResponseEntity. status(HttpStatus.NOT_FOUND).body(error);
//    }
}
