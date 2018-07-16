package com.capgemini.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.demo.model.Players;
import com.capgemini.demo.repositories.PlayerRepository;

@RestController
@RequestMapping("/api/v1/players")
public class PlayersController {
	
	@Autowired
	private PlayerRepository playerRepository;
	
	@GetMapping("")
	public List<Players> List() {
		return playerRepository.findAll();
	}
	
	@GetMapping("/{number}")
	public Optional<Players> getPlayer(@PathVariable("number") int number) {
		return playerRepository.findById(number);
	}
	
	@GetMapping("/stats/{number}")
	public List<Players> getStats(@PathVariable("number") int number) {
		if(getPosition(number).equals("Pitcher")) 
			return playerRepository.findByPitchNumber(number);
		else
			return playerRepository.findByHitNumber(number);
	}
	
	@PreAuthorize("hasAnyRole('ADMIN')")
	@GetMapping("/secured")
	public List<Players> securedList() {
		return playerRepository.findAll();
	}

	@GetMapping("/secured/{number}")
	public Optional<Players> getSecuredPlayer(@PathVariable("number") int number) {
		return playerRepository.findById(number);
	}
	
	@GetMapping("/secured/stats/{number}")
	public List<Players> getSecuredStats(@PathVariable("number") int number) {
		if(getPosition(number).equals("Pitcher")) 
			return playerRepository.findByPitchNumber(number);
		else
			return playerRepository.findByHitNumber(number);
	}
	
	@GetMapping("/position/{number}")
	public String getPosition(@PathVariable("number") int number) {
		return playerRepository.findByPosition(number);
	}
	
//	@GetMapping("/pitching/{number}")
//	public List<Players> getPitcher(@PathVariable("number") int number) {
//		return playerRepository.findByPitchNumber(number);
//	}
//	
//	@GetMapping("/hitting/{number}")
//	public List<Players> getHitter(@PathVariable("number") int number) {
//		return playerRepository.findByHitNumber(number);
//	}
	
//	@GetMapping("/{number}/{position}")
//	public List<Players> getStat(@PathVariable("number") int number, @PathVariable("position") String position) {
//		if(position.equals("Pitcher")) {
//			System.out.println("pitcher");
//			return playerRepository.findByPitchNumber(number);
//		}
//		else 
//			return playerRepository.findByHitNumber(number);
//	}
}
