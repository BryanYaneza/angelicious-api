package com.angelicious.backendservice.dao.dataservice;

import com.angelicious.backendservice.dao.interfaces.ProductDao;
import com.angelicious.backendservice.model.Product;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository("Product")
public class ProductDaoService implements ProductDao {

    @Override
    public int insertProduct(UUID uuid, Product product) {
        return 0;
    }

    @Override
    public List<Product> getAllProduct() {
        return null;
    }

    @Override
    public int deleteProduct(UUID id) {
        return 0;
    }

    @Override
    public int updateProduct(UUID id, Product product) {
        return 0;
    }
}
