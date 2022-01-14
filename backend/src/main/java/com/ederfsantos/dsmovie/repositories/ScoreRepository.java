package com.ederfsantos.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ederfsantos.dsmovie.entities.Score;
import com.ederfsantos.dsmovie.entities.ScorePK;
import com.ederfsantos.dsmovie.entities.User;

public interface ScoreRepository extends JpaRepository<Score, ScorePK> {
	
	
	

	
}
