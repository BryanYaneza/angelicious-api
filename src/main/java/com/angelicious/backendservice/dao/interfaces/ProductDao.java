package com.angelicious.backendservice.dao.interfaces;


import com.angelicious.backendservice.model.Product;

import java.util.List;
import java.util.UUID;

public interface ProductDao {
    int insertProduct(UUID uuid, Product product);
    List<Product> getAllProduct();
    int deleteProduct(UUID id);
    int updateProduct(UUID id, Product product);
}
