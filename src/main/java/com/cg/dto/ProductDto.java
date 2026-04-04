package com.cg.dto;

import jakarta.validation.constraints.*;

public class ProductDto {

    private Integer productId;

    @NotBlank(message = "Product name is required")
    @Pattern(regexp = "^[a-zA-Z ]{3,}$", message = "Product name must contain only alphabets and be at least 3 characters")
    private String productName;

    @NotNull(message = "Price is required")
    @Min(value = 1, message = "Price must be at least Rs 1")
    @Max(value = 500000, message = "Price must not exceed Rs 500000")
    private Double price;

    @NotBlank(message = "Category is required")
    @Pattern(regexp = "^(mobile|laptop)$", message = "Category must be 'mobile' or 'laptop'")
    private String category;

    // Getters and Setters
    public Integer getProductId() { return productId; }
    public void setProductId(Integer productId) { this.productId = productId; }

    public String getProductName() { return productName; }
    public void setProductName(String productName) { this.productName = productName; }

    public Double getPrice() { return price; }
    public void setPrice(Double price) { this.price = price; }

    public String getCategory() { return category; }
    public void setCategory(String category) { this.category = category; }
}