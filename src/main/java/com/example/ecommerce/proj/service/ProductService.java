package com.example.ecommerce.proj.service;

import com.example.ecommerce.proj.model.Product;
import com.example.ecommerce.proj.repo.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductRepo repo;
    public List<Product> getAllProducts() {
        return repo.findAll();
    }

    public Product addProduct(Product product) {
        return repo.save(product);
    }

    public Product getProductById(int id) {
        return repo.findById(id).orElse(null);
    }

    public void deleteProduct(int id) {
        repo.deleteById(id);
    }
    public Product updateProduct (Product product){
        return repo.save(product);
    }
}
