package com.angelicious.backendservice.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.hibernate.annotations.NaturalId;


import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.util.UUID;

@Entity
@Table(name = "orderdetail")
public class OrderDetails {
    @Id
    @NotBlank
    @Column(name = "orderid")
    private final UUID orderID;

    @NotBlank
    @Column(name = "userid")
    private final UUID userID;

    @NotBlank
    @Column(name = "productid")
    private UUID productId;

    @NotBlank
    @Column(name = "unitprice")
    private final Double unitPrice;

    @NotBlank
    @Column(name = "quantity")
    private final Integer quantity;

    @NotBlank
    @Column(name = "discount")
    private final Double discount;


    public OrderDetails(@JsonProperty("orderID") UUID orderID,
                        @JsonProperty("userID") UUID userID,
                        @JsonProperty("productID") UUID productID,
                        @JsonProperty("unitPrice") Double unitPrice,
                        @JsonProperty("quantity") Integer quantity,
                        @JsonProperty("discount") Double discount) {
        this.orderID = orderID;
        this.userID = userID;
        this.setProductId(productID);
        this.unitPrice = unitPrice;
        this.quantity = quantity;
        this.discount = discount;
    }


    public UUID getOrderID() {
        return orderID;
    }

    public UUID getUserID() {
        return userID;
    }

    public UUID getProductId() {
        return productId;
    }

    public void setProductId(UUID productId) {
        this.productId = productId;
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
