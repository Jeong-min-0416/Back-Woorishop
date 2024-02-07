package com.woorishop.woorishop.list.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.woorishop.woorishop.list.domain.Category;
import com.woorishop.woorishop.list.service.ProductService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/products")
@RequiredArgsConstructor
public class ProductController {

    private final ProductService productService;

    @GetMapping
    public List<Category> getAllProductsGroupedByCategory() {
        return productService.getProductsGroupedByCategory(9);
    }
}
