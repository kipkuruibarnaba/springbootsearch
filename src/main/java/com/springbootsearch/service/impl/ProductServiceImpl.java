package com.springbootsearch.service.impl;

import com.springbootsearch.entity.Product;
import com.springbootsearch.repository.ProductRepository;
import com.springbootsearch.service.ProductService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @created Barnaba Mutai
 * @created 10/ 09/ 2022 - 12:11 PM
 */
@Service
public class ProductServiceImpl implements ProductService {
    private ProductRepository productRepository;

    public ProductServiceImpl(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public List<Product> searchProducts(String query) {
        List<Product> products = productRepository.searchProductsSQL(query);
        return products;
    }

    @Override
    public Product createProduct(Product product) {
        return productRepository.save(product);
    }
}
