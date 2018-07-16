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
@Table(name = "batting")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Batting {

	@Id
	@Column(name = "players_number")
	private Integer number;

	@Column(name = "games")
	private Integer games;

	@Column(name = "atbats")
	private Integer atBats;

	@Column(name = "runs")
	private Integer runs;

	@Column(name = "hits")
	private Integer hits;

	@Column(name = "totalbases")
	private Integer totalBases;

	@Column(name = "doubles")
	private Integer doubles;

	@Column(name = "triples")
	private Integer triples;

	@Column(name = "homeruns")
	private Integer homeruns;

	@Column(name = "walks")
	private Integer walks;

	@Column(name = "intentionalwalks")
	private Integer intentionalWalks;

	@Column(name = "strikeouts")
	private Integer strikeouts;

	@Column(name = "stolenbases")
	private Integer stolenBases;

	@Column(name = "caughtstealing")
	private Integer caughtStealing;

	@Column(name = "avg")
	private Float avg;

	@Column(name = "obp")
	private Float obp;

	@Column(name = "slugging")
	private Float slugging;

	@Column(name = "ops")
	private Float ops;

	@OneToOne(fetch = FetchType.LAZY)
	@MapsId
	private Players players;

	public Batting() {
	}
	
	public Batting(Integer number, Integer games, Integer atBats, Integer runs, Integer hits, Integer totalBases,
			Integer doubles, Integer triples, Integer homeruns, Integer walks, Integer intentionalWalks,
			Integer strikeouts, Integer stolenBases, Integer caughtStealing, Float avg, Float obp, Float slugging,
			Float ops) {
		this.number = number;
		this.games = games;
		this.atBats = atBats;
		this.runs = runs;
		this.hits = hits;
		this.totalBases = totalBases;
		this.doubles = doubles;
		this.triples = triples;
		this.homeruns = homeruns;
		this.walks = walks;
		this.intentionalWalks = intentionalWalks;
		this.strikeouts = strikeouts;
		this.stolenBases = stolenBases;
		this.caughtStealing = caughtStealing;
		this.avg = avg;
		this.obp = obp;
		this.slugging = slugging;
		this.ops = ops;
	}

	public Integer getAtBats() {
		return atBats;
	}

	public Float getAvg() {
		return avg;
	}

	public Integer getCaughtStealing() {
		return caughtStealing;
	}

	public Integer getDoubles() {
		return doubles;
	}

	public Integer getGames() {
		return games;
	}

	public Integer getHits() {
		return hits;
	}

	public Integer getHomeruns() {
		return homeruns;
	}

	public Integer getIntentionalWalks() {
		return intentionalWalks;
	}

	public Integer getNumber() {
		return number;
	}

	public Float getObp() {
		return obp;
	}

	public Float getOps() {
		return ops;
	}

	public Integer getRuns() {
		return runs;
	}

	public Float getSlugging() {
		return slugging;
	}

	public Integer getStolenBases() {
		return stolenBases;
	}

	public Integer getStrikeouts() {
		return strikeouts;
	}

	public Integer getTotalBases() {
		return totalBases;
	}

	public Integer getTriples() {
		return triples;
	}

	public Integer getWalks() {
		return walks;
	}

	public void setAtBats(Integer atBats) {
		this.atBats = atBats;
	}

	public void setAvg(Float avg) {
		this.avg = avg;
	}

	public void setCaughtStealing(Integer caughtStealing) {
		this.caughtStealing = caughtStealing;
	}

	public void setDoubles(Integer doubles) {
		this.doubles = doubles;
	}

	public void setGames(Integer games) {
		this.games = games;
	}

	public void setHits(Integer hits) {
		this.hits = hits;
	}

	public void setHomeruns(Integer homeruns) {
		this.homeruns = homeruns;
	}

	public void setIntentionalWalks(Integer intentionalWalks) {
		this.intentionalWalks = intentionalWalks;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public void setObp(Float obp) {
		this.obp = obp;
	}

	public void setOps(Float ops) {
		this.ops = ops;
	}

	public void setRuns(Integer runs) {
		this.runs = runs;
	}

	public void setSlugging(Float slugging) {
		this.slugging = slugging;
	}

	public void setStolenBases(Integer stolenBases) {
		this.stolenBases = stolenBases;
	}

	public void setStrikeouts(Integer strikeouts) {
		this.strikeouts = strikeouts;
	}

	public void setTotalBases(Integer totalBases) {
		this.totalBases = totalBases;
	}

	public void setTriples(Integer triples) {
		this.triples = triples;
	}

	public void setWalks(Integer walks) {
		this.walks = walks;
	}	
}