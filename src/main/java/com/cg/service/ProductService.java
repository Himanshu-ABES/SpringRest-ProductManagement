package com.cg.service;

import com.cg.dto.ProductDto;
import com.cg.entity.Product;
import com.cg.exceptions.ProductNotFoundException;
import com.cg.repo.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductRepo productRepo;

    // Add a new product
    public Product addProduct(ProductDto dto) {
        Product product = new Product();
        product.setProductName(dto.getProductName());
        product.setPrice(dto.getPrice());
        product.setCategory(dto.getCategory());
        return productRepo.save(product);
    }

    // Get all products
    public List<Product> getAllProducts() {
        return productRepo.findAll();
    }

    // Get product by ID
    public Product getProductById(Integer id) {
        return productRepo.findById(id)
                .orElseThrow(() -> new ProductNotFoundException("Product not found with ID: " + id));
    }

    // Update product
    public Product updateProduct(ProductDto dto) {
        Product existing = productRepo.findById(dto.getProductId())
                .orElseThrow(() -> new ProductNotFoundException("Product not found with ID: " + dto.getProductId()));

        existing.setProductName(dto.getProductName());
        existing.setPrice(dto.getPrice());
        existing.setCategory(dto.getCategory());
        return productRepo.save(existing);
    }
}