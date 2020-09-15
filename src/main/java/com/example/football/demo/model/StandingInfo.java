package com.example.football.demo.model;

public class StandingInfo {

	private Country country;
	private Team team;
	private Integer standing;
	private League league;
	

	public StandingInfo(Country country, Team team, Integer standing, League league) {
		super();
		this.country = country;
		this.team = team;
		this.standing = standing;
		this.league = league;
	}
	public StandingInfo() {
		
	}
	public Country getCountry() {
		return country;
	}
	public void setCountry(Country country) {
		this.country = country;
	}
	public Team getTeam() {
		return team;
	}
	public void setTeam(Team team) {
		this.team = team;
	}
	
	public Integer getStanding() {
		return standing;
	}
	public void setStanding(Integer standing) {
		this.standing = standing;
	}
	public League getLeague() {
		return league;
	}
	public void setLeague(League league) {
		this.league = league;
	}
	
	
}
