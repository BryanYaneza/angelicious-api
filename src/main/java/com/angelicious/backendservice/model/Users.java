package com.angelicious.backendservice.model;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.validation.constraints.NotBlank;
import java.util.UUID;

public class Users {
    @NotBlank
    private final UUID id;
    @NotBlank
    private final String EmailAddress;
    @NotBlank
    private final String LastName;
    @NotBlank
    private final String FirstName;
    @NotBlank
    private final String PhoneNumber;
    @NotBlank
    private final String Address;
    @NotBlank
    private final String City;
    @NotBlank
    private final String Region;
    @NotBlank
    private final String PostalCode;
    @NotBlank
    private final String Country;


    public Users(@JsonProperty("uid") UUID uid,
                 @JsonProperty("emailAddress") String emailAdd,
                 @JsonProperty("lastName") String lastName,
                 @JsonProperty("firstName") String firstName,
                 @JsonProperty("phoneNumber") String phoneNumber,
                 @JsonProperty("address") String address,
                 @JsonProperty("city") String city,
                 @JsonProperty("region") String region,
                 @JsonProperty("postalCode") String postalCode,
                 @JsonProperty("country") String country) {
        this.id = uid;
        this.EmailAddress = emailAdd;
        this.LastName = lastName;
        this.FirstName = firstName;
        this.PhoneNumber = phoneNumber;
        this.Address = address;
        this.City = city;
        this.Region = region;
        this.PostalCode = postalCode;
        this.Country = country;
    }


    public UUID getId() {
        return id;
    }

    public String getEmailAddress() {
        return EmailAddress;
    }

    public String getLastName() {
        return LastName;
    }

    public String getFirstName() {
        return FirstName;
    }

    public String getPhoneNumber() {
        return PhoneNumber;
    }

    public String getAddress() {
        return Address;
    }

    public String getCity() {
        return City;
    }

    public String getRegion() {
        return Region;
    }

    public String getPostalCode() {
        return PostalCode;
    }

    public String getCountry() {
        return Country;
    }
}
