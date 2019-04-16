package com.angelicious.backendservice.dao.dataservice;

import com.angelicious.backendservice.dao.interfaces.OrderDao;
import com.angelicious.backendservice.model.Orders;
import com.angelicious.backendservice.model.Users;

import java.util.List;
import java.util.UUID;

public class OrderDaoService implements OrderDao {
    @Override
    public int insertOrder(UUID uuid, Orders order) {
        return 0;
    }

    @Override
    public List<Users> getAllOrders() {
        return null;
    }

    @Override
    public int deleteOrder(UUID id) {
        return 0;
    }

    @Override
    public int updateOrder(UUID id, Orders order) {
        return 0;
    }
}
