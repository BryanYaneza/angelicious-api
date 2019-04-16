package com.angelicious.backendservice.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.validation.constraints.NotBlank;
import java.util.Date;
import java.util.UUID;

public class Orders {
    @NotBlank
    private final UUID id;
    @NotBlank
    private final String userID;
    @NotBlank
    private final Date orderDate;
    @NotBlank
    private final Date requiredDate;
    @NotBlank
    private final Date shippedDate;

    public Orders(@JsonProperty("uid") UUID uid,
                 @JsonProperty("userID") String userID,
                 @JsonProperty("orderDate") Date orderDate,
                 @JsonProperty("requiredDate") Date requiredDate,
                 @JsonProperty("shippedDate") Date shippedDate) {
        this.id = uid;
        this.userID = userID;
        this.orderDate = orderDate;
        this.requiredDate = requiredDate;
        this.shippedDate = shippedDate;
    }


    public UUID getId() {
        return id;
    }

    public String getUserID() {
        return userID;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public Date getRequiredDate() {
        return requiredDate;
    }

    public Date getShippedDate() {
        return shippedDate;
    }
}
