package com.amalhealthbackend.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.amalhealthbackend.model.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class UserController {
 @PostMapping(value="/saveUser")
    public ResponseEntity<String> saveUser(@RequestBody User user) {
        try {
            return new ResponseEntity<>("User is okay", HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(e.getMessage(), HttpStatus.FORBIDDEN);
        }
}
@GetMapping(value ="/all")
public List<User>userList(){
    return List.of(
        new User(1,"Jocker","male","07789876","igira@gmail.com","picture","username","password"),
        new User(1,"Jocker","male","07789876","igira@gmail.com","picture","username","password"),
        new User(1,"Jocker","male","07789876","igira@gmail.com","picture","username","password"),
        new User(1,"Jocker","male","07789876","igira@gmail.com","picture","username","password"),
        new User(1,"Jocker","male","07789876","igira@gmail.com","picture","username","password")
        );
}
}
