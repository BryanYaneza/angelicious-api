package com.angelicious.backendservice.dao.dataservice;

import com.angelicious.backendservice.dao.interfaces.OrderDetail;
import com.angelicious.backendservice.model.OrderDetails;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;


@Repository("OrderDetail")
public class OrderDetailsService implements OrderDetail {
    @Override
    public int insertOrderDetail(UUID uuid, OrderDetails orderDetail) {
        return 0;
    }

    @Override
    public List<OrderDetails> getAllOrdersDetail() {
        return null;
    }

    @Override
    public int deleteOrderDetail(UUID id) {
        return 0;
    }

    @Override
    public int updateOrderDetail(UUID id, OrderDetails orderDetail) {
        return 0;
    }
}
