package com.example.football.demo.service;

import java.util.List;

import com.example.football.demo.model.Countries;
import com.example.football.demo.model.Country;
import com.example.football.demo.model.League;
import com.example.football.demo.model.Leagues;
import com.example.football.demo.model.Standing;
import com.example.football.demo.model.Standings;
import com.example.football.demo.model.Team;
import com.example.football.demo.model.Teams;

public interface FootballStandingApiService {
	
	List<Country> getCountries();
	List<League> getLeaguesByCountryId(String countryId);
	List<Standing> getStandingsInfoByLeagueId(String leagueId);
}
