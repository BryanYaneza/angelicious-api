package com.angelicious.backendservice.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import javax.validation.constraints.NotBlank;
import java.util.UUID;

public class Product {
    @NotBlank
    private final UUID id;
    @NotBlank
    private final String name;
    @NotBlank
    private final String description;
    @NotBlank
    private final Integer categoryID;
    @NotBlank
    private final Double price;
    @NotBlank
    private final Integer stock;
    @NotBlank
    private final Boolean status;


    public Product(@JsonProperty("uid") UUID uid,
                   @JsonProperty("name") String name,
                   @JsonProperty("description") String description,
                   @JsonProperty("categoryID") Integer categoryID,
                   @JsonProperty("price") Double price,
                   @JsonProperty("stock") Integer stock,
                   @JsonProperty("status") Boolean status) {
        this.id = uid;
        this.name = name;
        this.description = description;
        this.categoryID = categoryID;
        this.price = price;
        this.stock = stock;
        this.status = status;
    }


    public UUID getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }
    public Integer getCategoryID() {
        return categoryID;
    }

    public Double getPrice() {
        return price;
    }

    public Integer getStock() {
        return stock;
    }

    public Boolean getStatus() {
        return status;
    }
}
