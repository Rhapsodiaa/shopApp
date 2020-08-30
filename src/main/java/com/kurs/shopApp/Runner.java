package com.kurs.shopApp;

import com.kurs.shopApp.repository.ProductRepository;
import com.kurs.shopApp.repository.model.Product;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

//@Component
public class Runner implements CommandLineRunner {

    private final ProductRepository productRepository;

    public Runner(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        Product product = new Product();
        product.setName("Laptop");
        product.setDescription("idealny do programowania");
        product.setQuantity(10);
        productRepository.save(product);
    }
}
