package com.capgemini.demo.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.capgemini.demo.model.Players;

public interface PlayerRepository extends JpaRepository<Players, Integer> {
	
	@Query("SELECT p, b FROM Players p LEFT JOIN p.batting b ON p.number = b.number WHERE p.number = ?1")
	List<Players> findByHitNumber(@Param("number") int number);
	
	@Query("SELECT p, pitch FROM Players p LEFT JOIN p.pitching pitch ON p.number = pitch.number WHERE p.number = ?1")
	List<Players> findByPitchNumber(@Param("number") int number);
	
//	@Query("SELECT b FROM Batting b WHERE b.number = ?1")
//	List<Players> findByHitNumber(@Param("number") int number);
//	
//	@Query("SELECT p FROM Pitching p WHERE p.number = ?1")
//	List<Players> findByPitchNumber(@Param("number") int number);
	
	@Query("SELECT p.position FROM Players p WHERE p.number = ?1")
	public String findByPosition(@Param("number") int number);
}

	