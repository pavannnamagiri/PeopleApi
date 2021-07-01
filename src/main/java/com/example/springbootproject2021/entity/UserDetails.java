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

    private String linkedin;

    private String instagram;

    private String description;


    public UserDetails(String firstName, String lastName, String gender, String dob, String email, String phone, String photoUrl, String linkedin, String instagram, String description) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.dob = dob;
        this.email = email;
        this.phone = phone;
        this.photoUrl = photoUrl;
        this.linkedin = linkedin;
        this.instagram = instagram;
        this.description = description;
    }


}
