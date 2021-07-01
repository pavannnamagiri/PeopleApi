package com.example.springbootproject2021.controller;

import com.example.springbootproject2021.entity.UserDetails;
import com.example.springbootproject2021.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Pawan.Namagiri
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserRepository userRepository;


    @GetMapping(path="/basicDetails")
    public UserDetails getUserBasicDetails(@RequestParam(name="email") String email) {
        UserDetails userDetails = userRepository.findByEmail(email);

        return userDetails;
    }
}
