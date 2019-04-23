package com.angelicious.backendservice.service;

import com.angelicious.backendservice.dao.ProductDao;
import com.angelicious.backendservice.dao.ProductDaoService;
import com.angelicious.backendservice.dao.UsersDao;
import com.angelicious.backendservice.dao.UsersDaoService;
import com.angelicious.backendservice.model.Product;
import com.angelicious.backendservice.model.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class UsersService implements UsersDaoService {

    private final UsersDao usersDao;

    @Autowired
    public UsersService(@Qualifier("UsersDao") UsersDao usersDao){
        this.usersDao = usersDao;
    }

    @Override
    public Users insertUser(Users user) {
        return usersDao.save(user);
    }

    @Override
    public List<Users> selectAllUser() {
        return usersDao.findAll();
    }

    @Override
    public Optional<Users> selectUserById(UUID id) {
        return usersDao.findById(id);
    }

    @Override
    public void deleteUserById(UUID id) {
        usersDao.deleteById(id);
    }

    @Override
    public Users updateProductById(UUID id, Users user) {
        return  usersDao.save(new Users(id,
                            user.getEmailAddress(),
                            user.getLastName(),
                            user.getFirstName(),
                            user.getPhoneNumber(),
                            user.getAddress(),
                            user.getCity(),
                            user.getRegion(),
                            user.getPostalCode(),
                            user.getCountry()));
    }
}
