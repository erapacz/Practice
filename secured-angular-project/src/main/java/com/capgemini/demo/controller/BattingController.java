package com.capgemini.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.demo.model.Batting;
import com.capgemini.demo.repositories.BattingRepository;

@RestController
@RequestMapping("/api/v1/batting")
public class BattingController {

	@Autowired
	private BattingRepository battingRepository;
	
	@GetMapping
	public List<Batting> list() {
		return battingRepository.findAll();
	}
	
	@GetMapping("/{number}")
	public Batting get(@PathVariable("number") int number) {
		return battingRepository.getOne(number);
	}
}
