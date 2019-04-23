package com.angelicious.backendservice.service;

import com.angelicious.backendservice.dao.ProductDao;
import com.angelicious.backendservice.dao.ProductDaoService;
import com.angelicious.backendservice.model.Category;
import com.angelicious.backendservice.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;
import java.util.UUID;
@Service
public class ProductService implements ProductDaoService {

    private static String TAG = "ProductDaoService: ";
    private final ProductDao productDao;

    @Autowired
    public ProductService(@Qualifier("ProductDao") ProductDao productDao){
        this.productDao = productDao;
    }

    @Override
    public Product insertProduct(Product product) {
            return productDao.save(product);
    }

    @Override
    public List<Product> selectAllProducts() {
            return productDao.findAll();
    }

    @Override
    public Optional<Product> selectProductById(UUID id) {
        return productDao.findById(id);
    }

    @Override
    public void deleteProductById(UUID id) {
        productDao.deleteById(id);
    }

    @Override
    public Product updateProductById(UUID id, Product updatedProduct) {
        return productDao.save(new Product(id,
                                    updatedProduct.getName(),
                                    updatedProduct.getDescription(),
                                    updatedProduct.getCategoryID(),
                                    updatedProduct.getPrice(),
                                    updatedProduct.getStock(),
                                    updatedProduct.getStatus()));
    }
}
