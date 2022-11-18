package com.south.danielgirardiweb.resources;

import com.south.danielgirardiweb.entity.Product;
import com.south.danielgirardiweb.respository.ProductRepository;
import com.south.danielgirardiweb.service.StockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.security.Provider;
import java.util.List;
import java.util.Random;

//@Component
@RestController
@RequestMapping("/desafio2")
public class StockResource {

    //regras de negócio (fazer aqui),
    @Autowired
    private StockService service;

    @GetMapping("/findAll")
    public List<Product> findAll() {

        return service.findAll();
    }

    @PostMapping("/addProduct")
    public Product addProduct(@RequestBody Product product){
        return service.addProduct(product);
    }

    @DeleteMapping("/removeProduct/{code}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void removeProduct (@PathVariable("code") String code){
       service.removeProduct(code);
    }

    @PatchMapping ("/editProduct/{code}")
    public Product editProduct (@PathVariable("code") String code, @RequestBody Product product){
        return service.editProduct(code, product);
   }
}
