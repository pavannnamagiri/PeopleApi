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
    private long id;

    private String firstName;

    private String lastName;

    private String gender;

    private String dob;

    private String email;

    private String phone;

    private String photoUrl;

}
