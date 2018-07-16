package com.capgemini.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.demo.model.Pitching;
import com.capgemini.demo.repositories.PitchingRepository;

@RestController
@RequestMapping("/api/v1/pitching")
public class PitchingController {

	@Autowired
	private PitchingRepository pitchingRepository;
	
	@GetMapping
	public List<Pitching> list() {
		return pitchingRepository.findAll();
	}
		
	@GetMapping("/{number}")
	public Pitching get(@PathVariable("number") int number) {
		return pitchingRepository.getOne(number);
	}
}
