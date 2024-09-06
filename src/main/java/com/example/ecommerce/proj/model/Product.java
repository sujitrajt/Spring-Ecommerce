package com.example.ecommerce.proj.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;

import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String description    ;
    private String brand;
    private BigDecimal price;
    private String category;
    private int quantity;
    private String imageName;
    private String imageType;
    @Lob
    @Column(columnDefinition = "LONGBLOB")
    private byte[] imageData;
}
