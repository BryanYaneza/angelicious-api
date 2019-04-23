package com.angelicious.backendservice.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.util.Date;
import java.util.UUID;

@Entity
@Table(name = "orders")
public class Orders {

    @Id
    @Column(updatable = false, nullable = false, columnDefinition = "uuid DEFAULT uuid_generate_v4()",name = "orderid")
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
    private UUID id;

    @NotBlank
    @Column(name = "userid")
    private UUID userID;

    @Column(name = "orderdate")
    private Date orderDate;

    @NotBlank
    @Column(name = "requiredDate")
    private Date requiredDate;

    @NotBlank
    @Column(name = "shippeddate")
    private Date shippedDate;


    public Orders(){

    }
    public Orders(@JsonProperty("uid") UUID uid,
                 @JsonProperty("userID") UUID userID,
                 @JsonProperty("orderDate") Date orderDate,
                 @JsonProperty("requiredDate") Date requiredDate,
                 @JsonProperty("shippedDate") Date shippedDate) {
        this.setId(uid);
        this.setUserID(userID);
        this.setOrderDate(orderDate);
        this.setRequiredDate(requiredDate);
        this.setShippedDate(shippedDate);
    }


    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public UUID getUserID() {
        return userID;
    }

    public void setUserID(UUID userID) {
        this.userID = userID;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public Date getRequiredDate() {
        return requiredDate;
    }

    public void setRequiredDate(Date requiredDate) {
        this.requiredDate = requiredDate;
    }

    public Date getShippedDate() {
        return shippedDate;
    }

    public void setShippedDate(Date shippedDate) {
        this.shippedDate = shippedDate;
    }
}
