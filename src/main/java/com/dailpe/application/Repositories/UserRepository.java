package com.dailpe.application.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dailpe.application.Models.User;

import jakarta.transaction.Transactional;

public interface UserRepository  extends JpaRepository<User,Long>{
    
    @Transactional
    void dedeleteByUserIdOrMobileNumber(String userId,String mobileNumber);
}
