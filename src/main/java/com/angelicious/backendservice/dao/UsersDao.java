package com.angelicious.backendservice.dao;

import com.angelicious.backendservice.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;
@Repository("UsersDao")
public interface UsersDao extends JpaRepository<Users, UUID> {

}
