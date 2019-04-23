package com.angelicious.backendservice.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.util.UUID;

@Entity
@Table(name = "Product")
public class Product {

    @Id
    @Column(updatable = false, nullable = false, columnDefinition = "uuid DEFAULT uuid_generate_v4()",name = "productid")
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
    private UUID id;

    @NotBlank
    @Column(name = "productname")
    private String name;

    @NotBlank
    @Column(name = "productdescription")
    private String description;

    @NotBlank
    @Column(name = "categoryid")
    private UUID categoryID;

    @NotBlank
    @Column(name = "productprice")
    private Double price;

    @NotBlank
    @Column(name = "productinstock")
    private Integer stock;

    @NotBlank
    @Column(name = "productstatus")
    private Boolean status;

    public Product(){

    }
    public Product(@JsonProperty("name") String name,
                   @JsonProperty("description") String description,
                   @JsonProperty("categoryID") UUID categoryID,
                   @JsonProperty("price") Double price,
                   @JsonProperty("stock") Integer stock,
                   @JsonProperty("status") Boolean status) {
        this.setName(name);
        this.setDescription(description);
        this.setCategoryID(categoryID);
        this.setPrice(price);
        this.setStock(stock);
        this.setStatus(status);
    }


    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public UUID getCategoryID() {
        return categoryID;
    }

    public void setCategoryID(UUID categoryID) {
        this.categoryID = categoryID;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }
}
