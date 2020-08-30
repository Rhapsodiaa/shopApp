package com.kurs.shopApp.repository;

import com.kurs.shopApp.repository.model.Product;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ProductRepository extends CrudRepository<Product, Integer> {

    public List<Product> findAll();

}
