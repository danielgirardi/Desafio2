package com.south.danielgirardiweb.service;

import com.south.danielgirardiweb.entity.Product;
import com.south.danielgirardiweb.respository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.Random;

@Service
public class StockService {

    @Autowired
    private ProductRepository repository;

    //add
    public Product addProduct(Product product){
        product.setCode(getCode());
        return repository.save(product);
    }

    //delete
    public void removeProduct (String code){
        repository.deleteById(code);
    }

    //edit
    public Product editProduct (String code, Product product) {
        repository.deleteById(code);
        repository.save(product);

        return product;
    }

    public List<Product> findAll() {
        List<Product> result = repository.findAll();
        return result;
    }

    public String getCode() {
        String alphabet = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        Random random = new Random();

        String armazenaChaves = "";
        int index = -1;
        for (int i = 0; i < 8; i++) {
            index = random.nextInt(alphabet.length());
            armazenaChaves += alphabet.substring(index, index + 1);
        }
        return armazenaChaves;
    }
}

