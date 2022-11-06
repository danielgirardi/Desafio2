package com.south.danielgirardiweb.respository;

import com.south.danielgirardiweb.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, String> {

}

