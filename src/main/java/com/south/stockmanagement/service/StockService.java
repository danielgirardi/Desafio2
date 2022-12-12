package com.br.stockmanagement.service;

import com.br.stockmanagement.entity.Product;
import com.br.stockmanagement.respository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Random;

@Service
public class StockService {

    @Autowired
    private ProductRepository repository;


    public Product addProduct(Product product){
        product.setCode(getCode());
        return repository.save(product);
    }

    public void removeProduct (String code){
        repository.deleteById(code);
    }


    public Product editProduct (String code, Product product) {
        repository.deleteById(code);
        product.setCode(code);
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

