package com.kurs.shopApp.service;

import com.kurs.shopApp.repository.model.Product;

import java.util.List;

public interface ProductService {

    public List<Product> findAll();

    void create(Product product);

    void update(Product product);

    void deleteById(Integer id);

}
