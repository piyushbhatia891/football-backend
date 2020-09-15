package com.example.football.demo.utils;

public interface Constants {

	String API_KEY="9bb66184e0c8145384fd2cc0f7b914ada57b4e8fd2e4d6d586adcc27c257a978";
	String GET_COUNTRIES_API_URL="https://apiv2.apifootball.com/?action=get_countries&APIkey="+API_KEY;
	String GET_LEAGUES_BY_COUNTRY_API_URL="https://apiv2.apifootball.com/?action=get_leagues&country_id=%s&APIkey="+API_KEY;
	String GET_TEAMS_BY_LEAGUE_API_URL="https://apiv2.apifootball.com/?action=get_teams&league_id=%s&APIkey="+API_KEY;
	String GET_STANDINGS_BY_LEAGUE_API_URL="https://apiv2.apifootball.com/?action=get_standings&league_id=%s&APIkey="+API_KEY;
}
