package com.br.stockmanagement.resources.exceptions;


import org.springframework.web.bind.annotation.ControllerAdvice;

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
