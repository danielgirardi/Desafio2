package com.br.stockmanagement.service.exceptions;

public class ProdcutNotFoundException extends RuntimeException{

    // criei essa classe para quando der alguma exceção na minha API no postman https://www.youtube.com/watch?v=o1b5Gemtqrk&list=PLA8Qj9w4RGkWgyYa485pgf-VAoJgL4rW1&index=8
    public ProdcutNotFoundException(String message) {
        super(message);
    }
}
