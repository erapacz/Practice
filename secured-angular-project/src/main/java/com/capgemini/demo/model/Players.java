package com.capgemini.demo.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
@Table(name = "players")
public class Players {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "number")
	private Integer number;

	@Column(name = "firstname")
	private String firstName;

	@Column(name = "lastname")
	private String lastName;

	@Column(name = "position")
	private String position;

	@Column(name = "team")
	private String team;

	@Column(name = "bats")
	private String bats;

	@Column(name = "throws")
	private String thrws;

	@OneToOne(mappedBy = "players", cascade = CascadeType.ALL, fetch = FetchType.LAZY, optional = false)
	@JoinColumn(name = "number")
	private Batting batting;

	@OneToOne(mappedBy = "players", cascade = CascadeType.ALL, fetch = FetchType.LAZY, optional = false)
	@JoinColumn(name = "number")
	private Pitching pitching;

	public Players() {
	}

	public Players(Integer number, String firstName, String lastName, String position, String team, String bats,
			String thrws) {
		this.number = number;
		this.firstName = firstName;
		this.lastName = lastName;
		this.position = position;
		this.team = team;
		this.bats = bats;
		this.thrws = thrws;
	}

	public String getBats() {
		return bats;
	}

	// public Batting getBatting() {
	// return batting;
	// }

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public Integer getNumber() {
		return number;
	}

	// public Pitching getPitching() {
	// return pitching;
	// }

	public String getPosition() {
		return position;
	}
	
	public String getTeam() {
		return team;
	}

	public String getThrws() {
		return thrws;
	}

	public void setBats(String bats) {
		this.bats = bats;
	}

	// public void setBatting(Batting batting) {
	// this.batting = batting;
	// }

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	// public void setPitching(Pitching pitching) {
	// this.pitching = pitching;
	// }

	public void setPosition(String position) {
		this.position = position;
	}

	public void setTeam(String team) {
		this.team = team;
	}

	public void setThrws(String thrws) {
		this.thrws = thrws;
	}
}
