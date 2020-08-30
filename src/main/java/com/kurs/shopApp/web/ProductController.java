package com.kurs.shopApp.web;

import com.kurs.shopApp.repository.model.Product;
import com.kurs.shopApp.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/product")
public class ProductController {

    private final ProductService productService;

    @Autowired
    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping
    public List<Product> getAll() {
        return productService.findAll();
    }

    @PostMapping
    public void addProduct(@RequestBody Product product) {
        productService.create(product);
    }


}
