package com.south.danielgirardiweb.service;

import com.south.danielgirardiweb.entity.Product;
import com.south.danielgirardiweb.respository.ProductRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.*;

@SpringBootTest
class StockServiceTest {

    public static final double PRICE = 10.90;
    public static final int QUANTITY = 2;
    public static final String CATEGORY = "ferramenta";
    public static final int CODIGO_BARRA = 1234567;
    public static final String SERIE = "ferro";
    public static final String DESCRIPTION = "descrição";
    public static final double TAX = 1.0;
    public static final String MANUFACTURING_DATE = "10/10/2022";
    public static final String VALIDATION_DATE = "25/12/2022";
    public static final String COLOR = "amarelo";
    public static final String MATERIAL = "ferro";
    public static String NAME = "martelo";

    @InjectMocks
    private StockService service;

    @Mock
    private ProductRepository repository;

    @Mock
    private Product product;


    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);

        // aqui tu vai chamar aquele metodo que tu criou lá embaixo. Este método setUp ele é chamado automaticamente antes de rodar os testes
        startProduct();
    }

    @Test
    void whenAddProductThenReturnSucess() {
       when(repository.save(Mockito.any(Product.class))).thenReturn(product);

       Product response = service.addProduct(product);


       assertNotNull(response);
       assertEquals(Product.class, response.getClass());
       assertEquals(NAME, response.getName());
       assertEquals(PRICE, response.getPrice());
       assertEquals(QUANTITY, response.getQuantity());
       assertEquals(CATEGORY, response.getCategory());
       assertEquals(CODIGO_BARRA, response.getCodigoBarra());
       assertEquals(SERIE, response.getSerie());
       assertEquals(DESCRIPTION, response.getDescription());
       assertEquals(TAX, response.getTax());
    }

    @Test
    void whenRemoveProductThenReturnSucess() {

        doNothing().when(repository).deleteById(anyString());

        service.removeProduct("1234abcd");
    }

    @Test
    void editProduct() {

        


    }

    @Test
    void findAll() {
      //aula Valdir

        when(repository.findAll()).thenReturn(List.of(product));

        List<Product> response = service.findAll();

        assertNotNull(response);
        assertEquals(1, response.size());
    }

    @Test
    void getCode() {
    }

    private void startProduct(){

        product = new Product("abcde123", NAME, PRICE, QUANTITY, CATEGORY,
                CODIGO_BARRA, SERIE, DESCRIPTION, TAX, MANUFACTURING_DATE,
                VALIDATION_DATE, COLOR, MATERIAL);

    }
}