package com.example.football.demo;

import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

import com.example.football.demo.model.Countries;
import com.example.football.demo.model.Country;
import com.example.football.demo.service.CountryService;
import com.example.football.demo.utils.Constants;
import com.example.football.demo.utils.DataPopulation;

@Configuration
public class FootballAppConfiguration implements CommandLineRunner {

		@Autowired
	private DataPopulation dataPopulation;

	@Autowired
	private CountryService countryService;

	@Override
	public void run(String... args) throws Exception {
		dataPopulation.setCountries(countryService.getCountryFromApi().stream()
				.collect(Collectors.toMap(Country::getCountry_name, Country::getCountry_id)));
		//dataPopulation.setCountries(restTemplate.getForObject(Constants.GET_COUNTRIES_API_URL, Countries.class));

	}

}
