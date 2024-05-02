package com.amalfi.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.amalfi.entity.Users;
import com.amalfi.exception.UserException;
import com.amalfi.services.UsersService;


@RestController
public class UserController {

    @Autowired
    UsersService userService;

    @GetMapping("/findEmailUser")
    public ResponseEntity<Users> getByEmail(String email) {
        return new ResponseEntity<Users>(userService.findByEmail(email), HttpStatus.OK);
                
    }
    
    @GetMapping("/login")
    public ResponseEntity<Users> login (String email,String password) throws UserException{
    	return new ResponseEntity<Users>(userService.findByLogin(email, password),HttpStatus.OK);
    }
    
    @PostMapping("/addUser")
    public ResponseEntity<Users> aggiungiUtente(@RequestBody Users user) throws UserException{
    	if(userService.findByEmail(user.getEmail())==null) {
			return new ResponseEntity<Users>(userService.insertUtenza(user), HttpStatus.OK);
		}else {
			return new ResponseEntity<Users>(new Users(),HttpStatus.OK);
		}			
    }
    
    

}
