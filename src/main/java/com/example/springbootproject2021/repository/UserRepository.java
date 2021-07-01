package com.example.springbootproject2021.repository;

import com.example.springbootproject2021.entity.UserDetails;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * @author Pawan.Namagiri
 */
public interface UserRepository extends MongoRepository<UserDetails, String> {

    public UserDetails findByEmail(String email);
}
