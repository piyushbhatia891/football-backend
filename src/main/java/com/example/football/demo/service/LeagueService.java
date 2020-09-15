package com.example.football.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.football.demo.model.Countries;
import com.example.football.demo.model.League;
import com.example.football.demo.model.Leagues;

@Service
public class LeagueService {
	
	@Autowired
	private FootballStandingApiServiceImpl footballStandingApiServiceImpl;
	
	public List<League> getLeaguesForACountryFromApi(String countryId) {
		return footballStandingApiServiceImpl.getLeaguesByCountryId(countryId);
	}

}
