package com.example.springmvc;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
@Component
@Data
public class ProductReposit {

    private List<Product> list = new ArrayList<>();
    private Product product;

    public void addToList(Product product) {
        list.add(product);
    }
}
