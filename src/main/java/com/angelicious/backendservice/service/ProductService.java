package com.angelicious.backendservice.service;

import com.angelicious.backendservice.dao.ProductDao;
import com.angelicious.backendservice.dao.ProductDaoService;
import com.angelicious.backendservice.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import javax.swing.text.html.Option;
import java.util.List;
import java.util.Optional;
import java.util.UUID;
@Service
public class ProductService implements ProductDaoService {

    private static String TAG = "ProductDaoService: ";
    private ProductDao productDao;

    @Autowired
    public ProductService(@Qualifier("ProductDao") ProductDao productDao){
        this.productDao = productDao;
    }

    @Override
    public int insertProduct(Product product) {
        try{
            productDao.save(product);
            return 200;
        }catch (Exception e){
            System.out.println(TAG + e);
            return 201;
        }
    }

    @Override
    public List<Product> selectAllProducts() {
        try{
            return productDao.findAll();
        }catch (Exception e){
            System.out.println(TAG + e);
            return null;
        }
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
    public int updateProductById(UUID id, Product updatedProduct) {
            Optional<Product> productToBeUpdated = productDao.findById(id);
             return productToBeUpdated.map(product -> {
                productDao.save(new Product(updatedProduct.getName(),
                                            updatedProduct.getDescription(),
                                            updatedProduct.getCategoryID(),
                                            updatedProduct.getPrice(),
                                            updatedProduct.getStock(),
                                            updatedProduct.getStatus()));
                return 0;
            })
            .orElse(1);
    }
}
