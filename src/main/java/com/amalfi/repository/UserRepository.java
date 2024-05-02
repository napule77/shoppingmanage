package com.amalfi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.amalfi.entity.Users;

public interface UserRepository extends JpaRepository<Users, Integer> {

    Users findByemail(String email);

	Users findByEmailAndPassword(String email, String password);

}
