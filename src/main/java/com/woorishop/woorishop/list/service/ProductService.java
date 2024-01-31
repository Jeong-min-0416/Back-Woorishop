package com.woorishop.woorishop.list.service;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import org.springframework.stereotype.Service;

import com.woorishop.woorishop.list.domain.Category;
import com.woorishop.woorishop.list.domain.Product;

@Service
public class ProductService {

    private static final List<String> CATEGORIES = Arrays.asList(
            "인기상품",
            "PV관 신규상품",
            "건강기능식품/건강식품",
            "일반식품/음료",
            "기능성화장품",
            "생활/건강용품",
            "욕실/주방용품",
            "침구류",
            "액세서리류",
            "신발/패션잡화",
            "기능성벨트/의류");

    public List<Category> getProductsGroupedByCategory(int productsPerCategory) {
        return generateDummyData(productsPerCategory);
    }

    private List<Category> generateDummyData(int productsPerCategory) {
        return CATEGORIES.stream()
                .map(category -> new Category(category, generateProducts(category, productsPerCategory)))
                .collect(Collectors.toList());
    }

    private List<Product> generateProducts(String category, int productsPerCategory) {
        Random random = new Random();
        return IntStream.rangeClosed(1, productsPerCategory)
                .mapToObj(index -> {
                    int price = (int) (10000 * (1 + random.nextDouble()));
                    return new Product(index, "Product " + index, price, category);
                })
                .collect(Collectors.toList());
    }

}
