package com.woorishop.woorishop.list.service;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.woorishop.woorishop.list.domain.Product;

@Service
public class ProductService {

    public Map<String, List<Product>> getProductsGroupedByCategory() {
        List<Product> allProducts = Arrays.asList(
                /* 인기상품 */
                new Product(1, "Product 1", 10.000, "인기상품"),
                new Product(2, "Product 2", 20.000, "인기상품"),
                new Product(3, "Product 3", 30.000, "인기상품"),
                new Product(4, "Product 4", 40.000, "인기상품"),
                new Product(5, "Product 5", 50.000, "인기상품"),
                new Product(6, "Product 6", 60.000, "인기상품"),
                new Product(7, "Product 7", 70.000, "인기상품"),
                new Product(8, "Product 8", 80.000, "인기상품"),
                new Product(9, "Product 9", 90.000, "인기상품"),
                new Product(10, "Product 10", 100.000, "인기상품"),
                /* PV관 신규상품 */
                new Product(1, "Product 1", 10.000, "PV관 신규상품"),
                new Product(2, "Product 2", 20.000, "PV관 신규상품"),
                new Product(3, "Product 3", 30.000, "PV관 신규상품"),
                new Product(4, "Product 4", 40.000, "PV관 신규상품"),
                new Product(5, "Product 5", 50.000, "PV관 신규상품"),
                new Product(6, "Product 6", 60.000, "PV관 신규상품"),
                new Product(7, "Product 7", 70.000, "PV관 신규상품"),
                new Product(8, "Product 8", 80.000, "PV관 신규상품"),
                new Product(9, "Product 9", 90.000, "PV관 신규상품"),
                new Product(10, "Product 10", 100.000, "PV관 신규상품"),
                /* 건강기능식품/건강식품 */
                new Product(1, "Product 1", 10.000, "건강기능식품/건강식품"),
                new Product(2, "Product 2", 20.000, "건강기능식품/건강식품"),
                new Product(3, "Product 3", 30.000, "건강기능식품/건강식품"),
                new Product(4, "Product 4", 40.000, "건강기능식품/건강식품"),
                new Product(5, "Product 5", 50.000, "건강기능식품/건강식품"),
                new Product(6, "Product 6", 60.000, "건강기능식품/건강식품"),
                new Product(7, "Product 7", 70.000, "건강기능식품/건강식품"),
                new Product(8, "Product 8", 80.000, "건강기능식품/건강식품"),
                new Product(9, "Product 9", 90.000, "건강기능식품/건강식품"),
                new Product(10, "Product 10", 100.000, "건강기능식품/건강식품"),
                /* 일반식품/음료 */
                new Product(1, "Product 1", 10.000, "일반식품/음료"),
                new Product(2, "Product 2", 20.000, "일반식품/음료"),
                new Product(3, "Product 3", 30.000, "일반식품/음료"),
                new Product(4, "Product 4", 40.000, "일반식품/음료"),
                new Product(5, "Product 5", 50.000, "일반식품/음료"),
                new Product(6, "Product 6", 60.000, "일반식품/음료"),
                new Product(7, "Product 7", 70.000, "일반식품/음료"),
                new Product(8, "Product 8", 80.000, "일반식품/음료"),
                new Product(9, "Product 9", 90.000, "일반식품/음료"),
                new Product(10, "Product 10", 100.000, "일반식품/음료"),
                /* 기능성화장품 */
                new Product(1, "Product 1", 10.000, "기능성화장품"),
                new Product(2, "Product 2", 20.000, "기능성화장품"),
                new Product(3, "Product 3", 30.000, "기능성화장품"),
                new Product(4, "Product 4", 40.000, "기능성화장품"),
                new Product(5, "Product 5", 50.000, "기능성화장품"),
                new Product(6, "Product 6", 60.000, "기능성화장품"),
                new Product(7, "Product 7", 70.000, "기능성화장품"),
                new Product(8, "Product 8", 80.000, "기능성화장품"),
                new Product(9, "Product 9", 90.000, "기능성화장품"),
                new Product(10, "Product 10", 100.000, "기능성화장품"),
                /* 생활/건강용품 */
                new Product(1, "Product 1", 10.000, "생활/건강용품"),
                new Product(2, "Product 2", 20.000, "생활/건강용품"),
                new Product(3, "Product 3", 30.000, "생활/건강용품"),
                new Product(4, "Product 4", 40.000, "생활/건강용품"),
                new Product(5, "Product 5", 50.000, "생활/건강용품"),
                new Product(6, "Product 6", 60.000, "생활/건강용품"),
                new Product(7, "Product 7", 70.000, "생활/건강용품"),
                new Product(8, "Product 8", 80.000, "생활/건강용품"),
                new Product(9, "Product 9", 90.000, "생활/건강용품"),
                new Product(10, "Product 10", 100.000, "생활/건강용품"),
                /* 욕실/주방용품 */
                new Product(1, "Product 1", 10.000, "욕실/주방용품"),
                new Product(2, "Product 2", 20.000, "욕실/주방용품"),
                new Product(3, "Product 3", 30.000, "욕실/주방용품"),
                new Product(4, "Product 4", 40.000, "욕실/주방용품"),
                new Product(5, "Product 5", 50.000, "욕실/주방용품"),
                new Product(6, "Product 6", 60.000, "욕실/주방용품"),
                new Product(7, "Product 7", 70.000, "욕실/주방용품"),
                new Product(8, "Product 8", 80.000, "욕실/주방용품"),
                new Product(9, "Product 9", 90.000, "욕실/주방용품"),
                new Product(10, "Product 10", 100.000, "욕실/주방용품"),
                /* 침구류 */
                new Product(1, "Product 1", 10.000, "침구류"),
                new Product(2, "Product 2", 20.000, "침구류"),
                new Product(3, "Product 3", 30.000, "침구류"),
                new Product(4, "Product 4", 40.000, "침구류"),
                new Product(5, "Product 5", 50.000, "침구류"),
                new Product(6, "Product 6", 60.000, "침구류"),
                new Product(7, "Product 7", 70.000, "침구류"),
                new Product(8, "Product 8", 80.000, "침구류"),
                new Product(9, "Product 9", 90.000, "침구류"),
                new Product(10, "Product 10", 100.000, "침구류"),
                /* 액세서리류 */
                new Product(1, "Product 1", 10.000, "액세서리류"),
                new Product(2, "Product 2", 20.000, "액세서리류"),
                new Product(3, "Product 3", 30.000, "액세서리류"),
                new Product(4, "Product 4", 40.000, "액세서리류"),
                new Product(5, "Product 5", 50.000, "액세서리류"),
                new Product(6, "Product 6", 60.000, "액세서리류"),
                new Product(7, "Product 7", 70.000, "액세서리류"),
                new Product(8, "Product 8", 80.000, "액세서리류"),
                new Product(9, "Product 9", 90.000, "액세서리류"),
                new Product(10, "Product 10", 100.000, "액세서리류"),
                /* 신발/패션잡화 */
                new Product(1, "Product 1", 10.000, "신발/패션잡화"),
                new Product(2, "Product 2", 20.000, "신발/패션잡화"),
                new Product(3, "Product 3", 30.000, "신발/패션잡화"),
                new Product(4, "Product 4", 40.000, "신발/패션잡화"),
                new Product(5, "Product 5", 50.000, "신발/패션잡화"),
                new Product(6, "Product 6", 60.000, "신발/패션잡화"),
                new Product(7, "Product 7", 70.000, "신발/패션잡화"),
                new Product(8, "Product 8", 80.000, "신발/패션잡화"),
                new Product(9, "Product 9", 90.000, "신발/패션잡화"),
                new Product(10, "Product 10", 100.000, "신발/패션잡화"),
                /* 기능성벨트/의류 */
                new Product(1, "Product 1", 10.000, "기능성벨트/의류"),
                new Product(2, "Product 2", 20.000, "기능성벨트/의류"),
                new Product(3, "Product 3", 30.000, "기능성벨트/의류"),
                new Product(4, "Product 4", 40.000, "기능성벨트/의류"),
                new Product(5, "Product 5", 50.000, "기능성벨트/의류"),
                new Product(6, "Product 6", 60.000, "기능성벨트/의류"),
                new Product(7, "Product 7", 70.000, "기능성벨트/의류"),
                new Product(8, "Product 8", 80.000, "기능성벨트/의류"),
                new Product(9, "Product 9", 90.000, "기능성벨트/의류"),
                new Product(10, "Product 10", 100.000, "기능성벨트/의류")
        );

        // 상품을 카테고리로 그룹화 (LinkedHashMap 사용하여 순서 유지)
        Map<String, List<Product>> groupedProducts = allProducts.stream()
                .collect(Collectors.groupingBy(Product::getCategory, LinkedHashMap::new, Collectors.toList()));

        return groupedProducts;
    }
}
