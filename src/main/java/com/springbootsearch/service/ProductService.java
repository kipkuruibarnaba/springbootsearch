package com.springbootsearch.service;

import com.springbootsearch.entity.Product;

import java.util.List;

/**
 * @created Barnaba Mutai
 * @created 10/ 09/ 2022 - 12:11 PM
 */
public interface ProductService {
    List<Product> searchProducts(String query);

    Product createProduct(Product product);
}
