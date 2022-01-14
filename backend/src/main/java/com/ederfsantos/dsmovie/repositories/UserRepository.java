package com.ederfsantos.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ederfsantos.dsmovie.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

	User findByEmail(String email);
}
