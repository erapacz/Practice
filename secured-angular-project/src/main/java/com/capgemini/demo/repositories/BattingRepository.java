package com.capgemini.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.capgemini.demo.model.Batting;

public interface BattingRepository extends JpaRepository<Batting, Integer>{

}
