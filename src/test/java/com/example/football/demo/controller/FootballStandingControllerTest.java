package com.example.football.demo.controller;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

public class FootballStandingControllerTest extends AbstractTest {

	@Override
	@Before
	public void setUp() {
		super.setUp();
	}
	
	@Test
	public void getStandings() throws Exception {
		String url="/api/v1/standings?country=England&league=Championship&team=Birmingham";
		MvcResult result=mockMvc.perform(MockMvcRequestBuilders.get(url))
				.andReturn();
		int status= result.getResponse().getStatus();
		assertEquals(200,status);
	}
	
	@Test
	public void getStandingsWhereCountryDoesNotExist() throws Exception {
		String url="/api/v1/standings?country=abs&league=Championship&team=Leicester";
		MvcResult result=mockMvc.perform(MockMvcRequestBuilders.get(url))
				.andReturn();
		int status= result.getResponse().getStatus();
		assertEquals(404,status);
	}
	
	@Test
	public void getStandingsWhereLeagueDoesNotExist() throws Exception {
		String url="/api/v1/standings?country=England&league=abc&team=Leicester";
		MvcResult result=mockMvc.perform(MockMvcRequestBuilders.get(url))
				.andReturn();
		int status= result.getResponse().getStatus();
		assertEquals(404,status);
	}
	
	@Test
	public void getStandingsWhereLeagueAndTeamAreNotProvided() throws Exception {
		String url="/api/v1/standings?country=England&league=abc&team=Leicester";
		MvcResult result=mockMvc.perform(MockMvcRequestBuilders.get(url))
				.andReturn();
		int status= result.getResponse().getStatus();
		assertEquals(404,status);
	}
	@Test
	public void getStandingsWhereLeagueDoesNotExistInQuery() throws Exception {
		String url="/api/v1/standings?country=England";
		MvcResult result=mockMvc.perform(MockMvcRequestBuilders.get(url))
				.andReturn();
		int status= result.getResponse().getStatus();
		assertEquals(400,status);
	}
	@Test
	public void getStandingsWhereLeagueAndCountryNotExistInQuery() throws Exception {
		String url="/api/v1/standings?team=birmingham";
		MvcResult result=mockMvc.perform(MockMvcRequestBuilders.get(url))
				.andReturn();
		int status= result.getResponse().getStatus();
		assertEquals(400,status);
	}
}