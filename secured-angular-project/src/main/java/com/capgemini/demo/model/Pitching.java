package com.capgemini.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.MapsId;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "pitching")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Pitching {

	@Id
	@Column(name = "players_number")
	private Integer number;

	@Column(name = "wins")
	private Integer wins;

	@Column(name = "losses")
	private Integer losses;

	@Column(name = "ERA")
	private Float ERA;

	@Column(name = "games")
	private Integer games;

	@Column(name = "gamesstarted")
	private Integer gamesStarted;

	@Column(name = "completegame")
	private Integer completeGame;

	@Column(name = "shutout")
	private Integer shutout;

	@Column(name = "saves")
	private Integer saves;

	@Column(name = "saveopportunity")
	private Integer saveOpportunity;

	@Column(name = "inningspitched")
	private Float inningsPitched;

	@Column(name = "hits")
	private Integer hits;

	@Column(name = "runs")
	private Integer runs;

	@Column(name = "earnedruns")
	private Integer earnedRuns;

	@Column(name = "homeruns")
	private Integer homeruns;

	@Column(name = "hitbatters")
	private Integer hitBatters;

	@Column(name = "walks")
	private Integer walks;

	@Column(name = "intentionalwalks")
	private Integer intentionalWalks;

	@Column(name = "strikeouts")
	private Integer strikeouts;

	@Column(name = "opponentavg")
	private Float opponentAVG;

	@Column(name = "whip")
	private Float whip;

	@OneToOne(fetch = FetchType.LAZY)
	@MapsId
	private Players players;

	public Pitching() {
	}

	public Pitching(Integer number, Integer wins, Integer losses, Float eRA, Integer games, Integer gamesStarted,
			Integer completeGame, Integer shutout, Integer saves, Integer saveOpportunity, Float inningsPitched,
			Integer hits, Integer runs, Integer earnedRuns, Integer homeruns, Integer hitBatters, Integer walks,
			Integer intentionalWalks, Integer strikeouts, Float opponentAVG, Float whip) {
		this.number = number;
		this.wins = wins;
		this.losses = losses;
		this.ERA = eRA;
		this.games = games;
		this.gamesStarted = gamesStarted;
		this.completeGame = completeGame;
		this.shutout = shutout;
		this.saves = saves;
		this.saveOpportunity = saveOpportunity;
		this.inningsPitched = inningsPitched;
		this.hits = hits;
		this.runs = runs;
		this.earnedRuns = earnedRuns;
		this.homeruns = homeruns;
		this.hitBatters = hitBatters;
		this.walks = walks;
		this.intentionalWalks = intentionalWalks;
		this.strikeouts = strikeouts;
		this.opponentAVG = opponentAVG;
		this.whip = whip;
	}

	public Integer getCompleteGame() {
		return completeGame;
	}

	public Integer getEarnedRuns() {
		return earnedRuns;
	}

	public Float getERA() {
		return ERA;
	}

	public Integer getGames() {
		return games;
	}

	public Integer getGamesStarted() {
		return gamesStarted;
	}

	public Integer getHitBatters() {
		return hitBatters;
	}

	public Integer getHits() {
		return hits;
	}

	public Integer getHomeruns() {
		return homeruns;
	}

	public Float getInningsPitched() {
		return inningsPitched;
	}

	public Integer getIntentionalWalks() {
		return intentionalWalks;
	}

	public Integer getLosses() {
		return losses;
	}

	public Integer getNumber() {
		return number;
	}

	public Float getOpponentAVG() {
		return opponentAVG;
	}

	public Integer getRuns() {
		return runs;
	}

	public Integer getSaveOpportunity() {
		return saveOpportunity;
	}

	public Integer getSaves() {
		return saves;
	}

	public Integer getShutout() {
		return shutout;
	}

	public Integer getStrikeouts() {
		return strikeouts;
	}

	public Integer getWalks() {
		return walks;
	}

	public Float getWhip() {
		return whip;
	}

	public Integer getWins() {
		return wins;
	}

	public void setCompleteGame(Integer completeGame) {
		this.completeGame = completeGame;
	}

	public void setEarnedRuns(Integer earnedRuns) {
		this.earnedRuns = earnedRuns;
	}

	public void setERA(Float eRA) {
		ERA = eRA;
	}

	public void setGames(Integer games) {
		this.games = games;
	}

	public void setGamesStarted(Integer gamesStarted) {
		this.gamesStarted = gamesStarted;
	}

	public void setHitBatters(Integer hitBatters) {
		this.hitBatters = hitBatters;
	}

	public void setHits(Integer hits) {
		this.hits = hits;
	}

	public void setHomeruns(Integer homeruns) {
		this.homeruns = homeruns;
	}

	public void setInningsPitched(Float inningsPitched) {
		this.inningsPitched = inningsPitched;
	}

	public void setIntentionalWalks(Integer intentionalWalks) {
		this.intentionalWalks = intentionalWalks;
	}

	public void setLosses(Integer losses) {
		this.losses = losses;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public void setOpponentAVG(Float opponentAVG) {
		this.opponentAVG = opponentAVG;
	}

	public void setRuns(Integer runs) {
		this.runs = runs;
	}

	public void setSaveOpportunity(Integer saveOpportunity) {
		this.saveOpportunity = saveOpportunity;
	}

	public void setSaves(Integer saves) {
		this.saves = saves;
	}

	public void setShutout(Integer shutout) {
		this.shutout = shutout;
	}

	public void setStrikeouts(Integer strikeouts) {
		this.strikeouts = strikeouts;
	}

	public void setWalks(Integer walks) {
		this.walks = walks;
	}

	public void setWhip(Float whip) {
		this.whip = whip;
	}

	public void setWins(Integer wins) {
		this.wins = wins;
	}
}
