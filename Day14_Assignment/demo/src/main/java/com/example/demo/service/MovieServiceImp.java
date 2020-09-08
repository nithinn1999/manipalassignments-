     package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Movie;
import com.example.demo.repository.IMovieRepository;

@Service
public class MovieServiceImp implements IMovieService{

	@Autowired
	private IMovieRepository repository;
	@Override
	public String addMovie(Movie movie) {
		repository.save(movie);
	
		return "Movie Updated Successfully";
	}
	
	@Override
	public void addOrUpdateMovie(Movie movie) {
		repository.save(movie);
	}
	@Override
	public Movie getMovieById(int movieId) {
		return repository.findById(movieId).orElse(null);
	}

	@Override
	public void deleteMovie(int movieId) {
		 repository.deleteById(movieId);
	}

	@Override
	public List<Movie> getAllMovie() {
		
		List<Movie> movie = repository.findAll();
		return movie;
	}

	@Override
	public List<Movie> getByTitle(String title) {
		List<Movie> movie=(List<Movie>) repository.findByTitle(title);
		return movie;
	}

	@Override
	public List<Movie> getByRoleAndTitle(String leadRole, String title) {
	List<Movie> movie = (List<Movie>) repository.findByLeadRoleAndTitle(leadRole, title);
		return movie;
	}

	
	

}
