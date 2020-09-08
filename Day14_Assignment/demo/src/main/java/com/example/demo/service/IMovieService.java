package com.example.demo.service;

import java.util.List;

import com.example.demo.model.Movie;


public interface IMovieService {
	public void addOrUpdateMovie(Movie movie);

	public String addMovie(Movie movie);
	public Movie getMovieById(int movieId);
	
	public void deleteMovie(int movieId);
	public List<Movie> getAllMovie();
	public List<Movie> getByTitle(String title);
	
	public List<Movie> getByRoleAndTitle(String leadRole, String title);
	
	
}
