package com.angelicious.backendservice.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.validation.constraints.NotBlank;

public class OrderDetails {
    @NotBlank
    private final Integer orderID;
    @NotBlank
    private final Integer userID;
    @NotBlank
    private final Double unitPrice;
    @NotBlank
    private final Integer quantity;
    @NotBlank
    private final Double discount;


    public OrderDetails(@JsonProperty("orderID") Integer orderID,
                       @JsonProperty("userID") Integer userID,
                       @JsonProperty("unitPrice") Double unitPrice,
                       @JsonProperty("quantity") Integer quantity,
                       @JsonProperty("discount") Double discount) {
        this.orderID = orderID;
        this.userID = userID;
        this.unitPrice = unitPrice;
        this.quantity = quantity;
        this.discount = discount;
    }


    public Integer getOrderID() {
        return orderID;
    }

    public Integer getUserID() {
        return userID;
    }

    public Double getUnitPrice() {
        return unitPrice;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public Double getDiscount() {
        return discount;
    }
}
