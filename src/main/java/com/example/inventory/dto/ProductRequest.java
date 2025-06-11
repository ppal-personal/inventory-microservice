package com.example.inventory.dto;

import javax.validation.constraints.*;

public class ProductRequest {
    @NotBlank
    private String name;

    @Min(0)
    private int stock;

    // Getters and Setters
}