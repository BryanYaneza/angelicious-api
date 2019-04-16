package com.angelicious.backendservice.dao.interfaces;

import com.angelicious.backendservice.model.Orders;
import com.angelicious.backendservice.model.Users;

import java.util.List;
import java.util.UUID;

public interface OrderDao {
    int insertOrder(UUID uuid, Orders order);
    List<Users> getAllOrders();
    int deleteOrder(UUID id);
    int updateOrder(UUID id, Orders order);
}
