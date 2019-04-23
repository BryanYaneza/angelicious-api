package com.angelicious.backendservice.model;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import java.util.Date;
import java.util.UUID;

public class Users {
    @Id
    @Column(updatable = false, nullable = false, columnDefinition = "uuid DEFAULT uuid_generate_v4()",name = "orderid")
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
    private UUID id;

    @NotBlank
    @Email
    @Column(name = "useremailaddress")
    private String EmailAddress;

    @NotBlank
    @Column(name = "userlastname")
    private String LastName;

    @NotBlank
    @Column(name = "userfirstname")
    private String FirstName;

    @NotBlank
    @Column(name = "userphonenumber")
    private String PhoneNumber;

    @NotBlank
    @Column(name = "useraddress")
    private String Address;

    @NotBlank
    @Column(name = "usercity")
    private String City;

    @NotBlank
    @Column(name = "userregion")
    private String Region;

    @NotBlank
    @Column(name = "userpostalcode")
    private String PostalCode;

    @NotBlank
    @Column(name = "usercountry")
    private String Country;

    @Column(name = "createdon")
    private Date createdOn;

    @Column(name = "updatedon")
    private Date updatedOn;

    public Users(){

    }
    public Users(@JsonProperty("emailAddress") String emailAdd,
                 @JsonProperty("lastName") String lastName,
                 @JsonProperty("firstName") String firstName,
                 @JsonProperty("phoneNumber") String phoneNumber,
                 @JsonProperty("address") String address,
                 @JsonProperty("city") String city,
                 @JsonProperty("region") String region,
                 @JsonProperty("postalCode") String postalCode,
                 @JsonProperty("country") String country) {
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

    public Users(@JsonProperty("emailAddress") String emailAdd,
                 @JsonProperty("lastName") String lastName,
                 @JsonProperty("firstName") String firstName,
                 @JsonProperty("phoneNumber") String phoneNumber,
                 @JsonProperty("address") String address,
                 @JsonProperty("city") String city,
                 @JsonProperty("region") String region,
                 @JsonProperty("postalCode") String postalCode,
                 @JsonProperty("country") String country,
                 @JsonProperty("createdon") Date createdOn,
                 @JsonProperty("updatedon") Date updatedOn) {
        this.EmailAddress = emailAdd;
        this.LastName = lastName;
        this.FirstName = firstName;
        this.PhoneNumber = phoneNumber;
        this.Address = address;
        this.City = city;
        this.Region = region;
        this.PostalCode = postalCode;
        this.Country = country;
        this.setCreatedOn(createdOn);
        this.setUpdatedOn(updatedOn);
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

    public Date getCreatedOn() { return createdOn; }

    public void setCreatedOn(Date createdOn) { this.createdOn = createdOn; }

    public Date getUpdatedOn() { return updatedOn; }

    public void setUpdatedOn(Date updatedOn) { this.updatedOn = updatedOn; }
}
