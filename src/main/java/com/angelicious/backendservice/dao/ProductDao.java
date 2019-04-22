package com.angelicious.backendservice.dao;

import com.angelicious.backendservice.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface ProductDao extends JpaRepository<Product, UUID> {

}
