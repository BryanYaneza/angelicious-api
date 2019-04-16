package com.angelicious.backendservice.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.validation.constraints.NotBlank;
import java.util.UUID;

public class Category {
    @NotBlank
    private final UUID id;
    @NotBlank
    private final String name;
    @NotBlank
    private final String description;


    public Category(@JsonProperty("uid") UUID uid,
                   @JsonProperty("name") String name,
                   @JsonProperty("description") String description) {
        this.id = uid;
        this.name = name;
        this.description = description;
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
}
