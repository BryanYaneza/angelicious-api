package com.angelicious.backendservice.dao.interfaces;

import com.angelicious.backendservice.model.Users;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface UsersDao {
    int insertUser(UUID uuid, Users users);

    Optional<Users> selectUserById(UUID id);

    List<Users> getAllUsers();
    int deleteUser(UUID id);
    int updateUser(UUID id, Users users);
}
