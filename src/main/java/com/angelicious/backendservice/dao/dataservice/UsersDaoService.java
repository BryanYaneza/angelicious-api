package com.angelicious.backendservice.dao.dataservice;

import com.angelicious.backendservice.dao.interfaces.UsersDao;
import com.angelicious.backendservice.model.Users;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Repository("UserDao")
public class UsersDaoService implements UsersDao {
    @Override
    public int insertUser(UUID uuid, Users users) {
        return 0;
    }

    @Override
    public Optional<Users> selectUserById(UUID id) {
        return Optional.empty();
    }

    @Override
    public List<Users> getAllUsers() {
        return null;
    }

    @Override
    public int deleteUser(UUID id) {
        return 0;
    }

    @Override
    public int updateUser(UUID id, Users users) {
        return 0;
    }
}
