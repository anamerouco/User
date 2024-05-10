package com.example.user.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.user.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
}
