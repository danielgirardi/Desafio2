package com.south.stockmanagement.resources;

import com.br.stockmanagement.entity.Product;
import com.br.stockmanagement.service.StockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//@Component
@RestController
@RequestMapping("/desafio2")
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

   // lançar exceção
//    @Override
//    public .... findByid(Integer id){
//        Optinal<> obj = repository.findByid(id);
//        return obj.orElseThrow(() new ProductNotFoubdException("Objeto não encontrado"));
//    }


}
