package com.woorishop.woorishop.list.domain;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Product {
    private int id;            // ID
    private String name;        // 이름
    private double price;       // 가격
    private String category;    // 카테고리

}
