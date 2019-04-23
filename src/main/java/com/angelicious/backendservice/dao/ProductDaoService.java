package com.angelicious.backendservice.dao;

import com.angelicious.backendservice.model.Category;
import com.angelicious.backendservice.model.Product;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface ProductDaoService {
    int insertProduct(Product product);
    List<Product> selectAllProducts();
    Optional<Product> selectProductById(UUID id);
    void deleteProductById(UUID id);
    int updateProductById(UUID id, Product product);
}
