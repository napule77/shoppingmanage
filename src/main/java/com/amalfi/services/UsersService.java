package com.amalfi.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.amalfi.entity.Users;
import com.amalfi.repository.UserRepository;

@Service
public class UsersService {

    @Autowired
    UserRepository userRepo;

    public Users findByEmail(String email){
        return userRepo.findByemail(email);
    }

    

}
