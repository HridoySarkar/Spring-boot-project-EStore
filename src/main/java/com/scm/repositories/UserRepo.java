package com.scm.repositories;

import com.scm.entities.User;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends JpaRepository<User,String>{

    //Query
    

    //custom methord
    Optional<User> findByEmail(String email);

}
