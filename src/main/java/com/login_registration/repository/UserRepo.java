package com.login_registration.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.login_registration.entity.User;

public interface UserRepo extends JpaRepository<User, Integer> {

	public User findByEmail(String emaill);

}