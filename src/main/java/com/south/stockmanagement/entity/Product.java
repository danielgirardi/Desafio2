package com.br.stockmanagement.entity;

import lombok.*;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RestController;

import javax.persistence.*;
import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@With
@Entity
@Table(name = "Product") //nome da tabela no spring
public class Product implements Serializable {

    @Id
    @Column(name = "code", nullable = false)
    public String code;

    @Column(name = "name", nullable = false)
    public String name;

    @Column(name = "price", nullable = false)
    public Double price;

    @Column(name = "quantity", nullable = false)
    public Integer quantity;

    @Column(name = "category", nullable = false)
    public String category;

    @Column(name = "codigo_barra", nullable = false)
    public long codigoBarra;

    @Column(name = "serie", nullable = false)
    public String serie;

    @Column(name = "description", nullable = false)
    public String description;

    @Column(name = "tax", nullable = false)
    public Double tax;

    @Column(name = "manufacturingDate", nullable = false)
    public String manufacturingDate;

    @Column(name = "validationDate", nullable = false)
    public String validationDate;

    @Column(name = "color", nullable = false)
    public String color;

    @Column(name = "material", nullable = false)
    public String material;

    public Product(String name, Double price, Integer quantity, String category, long codigoBarra, String serie, String description,
       Double tax, String manufacturingDate, String validationDate, String color, String material) {
        this.name = name;

    }

}
