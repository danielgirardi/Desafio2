package com.south.stockmanagement.resources;

import com.south.stockmanagement.entity.Product;
import com.south.stockmanagement.service.StockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

//@Component
@RestController
@RequestMapping("/stockManagement")
public class StockResource {

    @Autowired
    private StockService service;

    @GetMapping("/findAllProducts")
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

    @PostMapping("/import")
    public void uploadFile(@RequestParam("file") MultipartFile file) {
        service.save(file);
    }


}
