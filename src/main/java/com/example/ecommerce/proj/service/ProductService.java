package com.example.ecommerce.proj.service;

import com.example.ecommerce.proj.model.Product;
import com.example.ecommerce.proj.repo.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductRepo repo;
    public List<Product> getAllProducts() {
        return repo.findAll();
    }

    public Product addProduct(Product product, MultipartFile imageFile) throws IOException {
        product.setImageName(imageFile.getOriginalFilename());
        product.setImageType(imageFile.getContentType());
        product.setImageData(imageFile.getBytes());
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

    public List<Product> searchProducts(String keyword) {
        return repo.searchProduct(keyword);

    }
}
