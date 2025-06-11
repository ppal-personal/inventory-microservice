package com.example.inventory.model;

import javax.persistence.*;
import javax.validation.constraints.*;

@Entity
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    private String name;

    @Min(0)
    private int stock;

    // Getters and Setters
}