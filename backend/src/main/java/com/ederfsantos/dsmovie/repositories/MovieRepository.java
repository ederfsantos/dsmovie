package com.ederfsantos.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ederfsantos.dsmovie.entities.Movie;

public interface MovieRepository extends JpaRepository<Movie, Long> {

	
}
