package com.amalfi.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import com.amalfi.entity.Users;
import com.amalfi.services.UsersService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class UserController {

    @Autowired
    UsersService userService;

    @GetMapping("findByEmail")
    public ResponseEntity<Users> getByEmail(@RequestParam String email) {
        return new ResponseEntity<Users>(userService.findByEmail(email), HttpStatus.OK);
                
    }
    

}
