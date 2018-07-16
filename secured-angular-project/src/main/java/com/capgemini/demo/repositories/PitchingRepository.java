package com.capgemini.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.capgemini.demo.model.Pitching;

public interface PitchingRepository extends JpaRepository<Pitching, Integer>{

}
