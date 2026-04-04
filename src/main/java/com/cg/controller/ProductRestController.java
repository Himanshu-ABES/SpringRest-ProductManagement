package com.cg.controller;

import com.cg.dto.ProductDto;
import com.cg.entity.Product;
import com.cg.service.ProductService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/product")
public class ProductRestController {

    @Autowired
    private ProductService productService;

    // POST /product — Add a new product
    @PostMapping
    public ResponseEntity<Product> addProduct(@Valid @RequestBody ProductDto dto) {
        Product saved = productService.addProduct(dto);
        return new ResponseEntity<>(saved, HttpStatus.CREATED); // 201
    }

    // GET /product — Get all products
    @GetMapping
    public ResponseEntity<List<Product>> getProducts() {
        List<Product> products = productService.getAllProducts();
        return new ResponseEntity<>(products, HttpStatus.OK); // 200
    }

    // GET /product/{id} — Get product by ID
    @GetMapping("/{id}")
    public ResponseEntity<Product> getProduct(@PathVariable Integer id) {
        Product product = productService.getProductById(id);
        return new ResponseEntity<>(product, HttpStatus.OK); // 200
    }

    // PUT /product — Update product
    @PutMapping
    public ResponseEntity<Product> editProduct(@Valid @RequestBody ProductDto dto) {
        Product updated = productService.updateProduct(dto);
        return new ResponseEntity<>(updated, HttpStatus.OK); // 200
    }
}