package com.example.springbootproject2021.entity;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * @author Pawan.Namagiri
 */
@Document(collection = "BasicDetails")
@Data
public class UserDetails {

    @Id
    private String id;

    private String firstName;

    private String lastName;

    private String gender;

    private String dob;

    private String email;

    private String phone;

    private String photoUrl;

    public UserDetails(String firstName, String lastName, String gender, String dob, String email, String phone, String photoUrl) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.dob = dob;
        this.email = email;
        this.phone = phone;
        this.photoUrl = photoUrl;
    }
}
