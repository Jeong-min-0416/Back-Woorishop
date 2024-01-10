package com.woorishop.woorishop.list.service;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.woorishop.woorishop.list.domain.Product;

@Service
public class ProductService {

    public Map<String, List<Product>> getProductsGroupedByCategory() {
        List<Product> 전체상품목록 = Arrays.asList(
                new Product(1, "Product 1", 10.000, "인기상품"),
                new Product(1, "Product 2", 20.000, "인기상품"),
                new Product(1, "Product 3", 30.000, "인기상품"),
                new Product(2, "Product 1", 10.000, "PV관 신규상품"),
                new Product(3, "Product 1", 10.000, "건강기능식품/건강식품")
        );

        // 상품을 카테고리로 그룹화
        Map<String, List<Product>> 그룹화된상품목록 = 전체상품목록.stream()
                .collect(Collectors.groupingBy(Product::getCategory));

        return 그룹화된상품목록;
    }
}
