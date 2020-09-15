package com.example.football.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.football.demo.model.Countries;
import com.example.football.demo.model.Country;
import com.example.football.demo.service.CountryService;

@RestController
@RequestMapping("api/v1")
public class CountryController {
	
	@Autowired
	private CountryService countryService;
	@GetMapping("/countries")
	public List<Country> getCOuntries() {
		return countryService.getCountryFromApi();
	}
}
