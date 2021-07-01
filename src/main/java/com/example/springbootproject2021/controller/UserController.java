package com.example.springbootproject2021.controller;

import com.example.springbootproject2021.entity.UserDetails;
import com.example.springbootproject2021.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Pawan.Namagiri
 */
@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserRepository userRepository;



    @GetMapping(path="/basicDetails")
    public UserDetails getUserBasicDetails(@RequestParam(name="email") String email) {
        UserDetails userDetails = userRepository.findByEmail(email);

        return userDetails;
    }

    @GetMapping
    public String getUserDetailPage(@RequestParam(name="email") String email, Model model){
        //UserDetails userDetails = userRepository.findByEmail(email);
        UserDetails userDetails = new UserDetails("pawan", "namagiri", "Male", "30/09/1997", "pavan@gmail.com", "9573279903", "https://media-exp3.licdn.com/dms/image/C5603AQEM5FsLVCbMAw/profile-displayphoto-shrink_200_200/0/1625077800206?e=1630540800&v=beta&t=B2-hfCnUNO9l63Kt7Ao5YXfMfcVqbMubwNxq_0yW4gY");
        model.addAttribute("userDetails", userDetails);
        return "userDetails";
    }
}
