package com.amalhealthbackend.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.amalhealthbackend.model.User;

@RestController
public class UserController {
 @PostMapping("/saveUser")
    public ResponseEntity<String> saveUser(@RequestBody User user) {
        try {
            return new ResponseEntity<>("User is okay", HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(e.getMessage(), HttpStatus.FORBIDDEN);
        }
}
}
