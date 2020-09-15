package com.example.football.demo.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;

import static org.junit.Assert.assertNotNull;
import static org.mockito.Mockito.*;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;

import com.example.football.demo.exception.TeamNotFoundException;
import com.example.football.demo.model.League;
import com.example.football.demo.model.Standing;
import com.example.football.demo.model.StandingInfo;
import com.example.football.demo.utils.DataPopulation;
@RunWith(MockitoJUnitRunner.class)
public class FootballStandingServiceImplTest {
	
	@InjectMocks
	private FootballStandingService footballStandingService;
	
	@Mock
	private FootballStandingApiServiceImpl footballStandingApiServiceImpl;

	@Mock
	private DataPopulation dataPopulation;

	@Mock
	private LeagueService leagueService;
	Map<String,String> countryMap=Map.of("England", "41");
	List<League> leagueList=new ArrayList<League>();
	List<Standing> standingInfo=new ArrayList<Standing>();
	
	@Before
	public void setUp() {
		League league=new League();
		league.setCountry_id("41");
		league.setCountry_name("England");
		league.setLeague_id("149");
		league.setLeague_name("Championship");
		leagueList.add(league);
		when(dataPopulation.getCountries()).thenReturn(countryMap);
		when(leagueService
				.getLeaguesForACountryFromApi(anyString())).thenReturn(leagueList);
		when(footballStandingApiServiceImpl.getStandingsInfoByLeagueId(anyString()))
		.thenReturn(standingInfo);
	}
	
	@Test(expected = TeamNotFoundException.class)
	public void getDataForStandings() {
		List<StandingInfo> info=footballStandingService
				.getStandingInfoForATeamInALeague("England","Championship","Birmingham",false);
		assertNotNull(info);
	}

}
