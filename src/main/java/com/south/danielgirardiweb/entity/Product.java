package com.south.danielgirardiweb.entity;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@AllArgsConstructor
//@NoArgsConstructor
@Builder
@With
@Entity
@Table(name = "product") //nome da tabela no spring
public class Product {

    @Id
    public String code;

    public String name;
    public Double price;
    public Integer quantity;
    public String category;
    public long codigoBarra;
    public String serie;
    public String description;
    public Double tax;
    public String manufacturingDate;
    public String validationDate;
    public String color;
    public String material;
    public Product () {
    }

}
