package com.south.danielgirardiweb.service;

import com.south.danielgirardiweb.entity.Product;
import com.south.danielgirardiweb.respository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/desafio2")
public class StockService {

    @Autowired
    private ProductRepository repository;
    //@Autowired
   // private StockManagement stockManagement;

    @GetMapping("/findAll")
    public List<Product> findAll(){
        List<Product> result = repository.findAll();
        return result;
    }

    public void addProduct(Product product){
       // stockManagement.addProduct(product);
    }

    @GetMapping("/daniel")
    public ResponseEntity<String> teste(){
        return ResponseEntity.ok("Olá mundo!");
    }

}
