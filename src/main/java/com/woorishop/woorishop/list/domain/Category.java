package com.woorishop.woorishop.list.domain;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Category {

    private String category; // 카테고리

    private List<Product> products; // 상품 리스트

}
