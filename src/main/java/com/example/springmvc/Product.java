package com.example.springmvc;

import lombok.Data;
import org.springframework.stereotype.Component;

@Data
public class Product {
    private int id, cost;
    private String title;

    public Product(int id, int cost, String title) {
        this.id = id;
        this.cost = cost;
        this.title = title;
    }
}
