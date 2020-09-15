package com.example.football.demo.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.football.demo.model.Countries;
import com.example.football.demo.model.Country;
import com.example.football.demo.model.League;
import com.example.football.demo.model.Leagues;
import com.example.football.demo.model.Standing;
import com.example.football.demo.model.Standings;
import com.example.football.demo.model.Teams;
import com.example.football.demo.utils.Constants;

@Service
public class FootballStandingApiServiceImpl implements FootballStandingApiService {

	@Autowired
	private RestTemplate restTemplate;
	@Override
	public List<Country> getCountries() {
		ResponseEntity<Country[]> val= 
				restTemplate.getForEntity(Constants.GET_COUNTRIES_API_URL, Country[].class);
		return  Arrays.asList(val.getBody());
	}

	@Override
	public List<League> getLeaguesByCountryId(String countryId) {
		ResponseEntity<League[]> val= 
				restTemplate.getForEntity(String.format(Constants.GET_LEAGUES_BY_COUNTRY_API_URL, countryId), League[].class);
		return  Arrays.asList(val.getBody());
		}

	@Override
	public List<Standing> getStandingsInfoByLeagueId(String leagueId) {
		ResponseEntity<Standing[]> val= 
				restTemplate.getForEntity(String.format(Constants.GET_STANDINGS_BY_LEAGUE_API_URL, leagueId), Standing[].class);
		return  Arrays.asList(val.getBody());
	}
	
}
