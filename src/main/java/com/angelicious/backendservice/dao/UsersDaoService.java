package com.angelicious.backendservice.dao;

import com.angelicious.backendservice.model.Product;
import com.angelicious.backendservice.model.Users;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface UsersDaoService {
    Users insertUser(Users user);
    List<Users> selectAllUser();
    Optional<Users> selectUserById(UUID id);
    void deleteUserById(UUID id);
    Users updateProductById(UUID id, Users user);
}
