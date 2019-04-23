package com.angelicious.backendservice.dao;

import com.angelicious.backendservice.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.UUID;
@Repository("ProductDao")
public interface ProductDao extends JpaRepository<Product, UUID> {


}
