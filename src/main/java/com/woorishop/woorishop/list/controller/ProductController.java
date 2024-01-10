package com.woorishop.woorishop.list.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.woorishop.woorishop.list.domain.Product;
import com.woorishop.woorishop.list.service.ProductService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/products")
@RequiredArgsConstructor
public class ProductController {

    @Autowired
    private final ProductService productService;

    @GetMapping
    public Map<String, List<Product>> getAllProductsGroupedByCategory() {
        return productService.getProductsGroupedByCategory();
    }
}
