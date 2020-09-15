package com.example.football.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.football.demo.model.Countries;
import com.example.football.demo.model.Country;

@Service
public class CountryService {
	
	@Autowired
	private FootballStandingApiServiceImpl footballStandingApiServiceImpl;
	
	public List<Country> getCountryFromApi() {
		return footballStandingApiServiceImpl.getCountries();
	}

}
