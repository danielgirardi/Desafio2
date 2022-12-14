package com.south.stockmanagement.service;

import com.opencsv.CSVReaderBuilder;
import com.south.stockmanagement.entity.Product;
import com.south.stockmanagement.respository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.InputStreamReader;
import java.io.Reader;
import java.util.List;
import java.util.Random;
import com.opencsv.CSVReader;

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


    public void save(MultipartFile file) {
        try {
            Reader reader = new InputStreamReader(file.getInputStream());
            CSVReader csvReader = new CSVReaderBuilder(reader).withSkipLines(1).build();

            List<String[]> mostruarioList = csvReader.readAll();
            for (String[] product : mostruarioList) {

                String codigo = product[0];
                Long codigoBarra = Long.parseLong(product[1]);
                String serie = (product[2]);
                String name = product[3];
                String description = product[4];
                String category = product[5];
                Double price = Double.parseDouble(product[6].replace(",", "."));
                Double tax = Double.parseDouble(product[7].replace(",", "."));
                String manufacturingDate = product[8];
                String validationDate = product[9];
                String color = product[10];
                String material = product[11];

                Product importProduct = new Product();
                importProduct.setCode(codigo);
                importProduct.setCodigoBarra(codigoBarra);
                importProduct.setSerie(serie);
                importProduct.setName(name);
                importProduct.setDescription(description);
                importProduct.setCategory(category);
                importProduct.setPrice(price);
                importProduct.setTax(tax);
                importProduct.setManufacturingDate(manufacturingDate);
                importProduct.setValidationDate(validationDate);
                importProduct.setColor(color);
                importProduct.setMaterial(material);
                importProduct.setQuantity(1);

                this.addProduct(importProduct);
            }

        } catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        }
    }
}

