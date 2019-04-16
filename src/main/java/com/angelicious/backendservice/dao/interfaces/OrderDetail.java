package com.angelicious.backendservice.dao.interfaces;



import com.angelicious.backendservice.model.OrderDetails;

import java.util.List;
import java.util.UUID;

public interface OrderDetail {
    int insertOrderDetail(UUID uuid, OrderDetails orderDetail);
    List<OrderDetails> getAllOrdersDetail();
    int deleteOrderDetail(UUID id);
    int updateOrderDetail(UUID id, OrderDetails orderDetail);
}
