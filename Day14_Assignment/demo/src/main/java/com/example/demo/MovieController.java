package com.example.demo;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.exception.MovieNotFoundException;
import com.example.demo.model.Movie;
import com.example.demo.service.IMovieService;
import com.example.demo.service.MovieServiceImp;

@RestController
@RequestMapping(value= "/movies")
public class MovieController {
	
	@Autowired
	private IMovieService movieService;
	
//	@RequestMapping(value="addmovie", method=RequestMethod.POST)
	@PostMapping
	public String addMovie(@RequestBody Movie movie) {
		movieService.addMovie(movie);
		System.out.println(movie);
		return "movie added successfully";
	}
	
	
	@GetMapping(value="find")
	public List<Movie> getMovieByTitleAndleadRole(@RequestParam String leadRole, @RequestParam String title){
		List<Movie> movie= movieService.getByRoleAndTitle(leadRole, title);
		return movie;
		
	}
	@GetMapping("find/{title}")
	public List<Movie> getMovie(@PathVariable String title) {
		List<Movie> movie =(List<Movie>) movieService.getByTitle(title);
		if(movie==null) {
			throw new MovieNotFoundException("Movie title is invalid");
		}
		return movie;
		
	}
	@GetMapping("allMovies")
	public List<Movie> getAllMovie(){
		List<Movie> movie = (List<Movie>) movieService.getAllMovie();
		return movie;
	}
	
	@GetMapping("delete/{movieId}")
	public String deleteMovie(@PathVariable int movieId) {
		 movieService.deleteMovie(movieId);
	return "Movie deleted Successfully";
	}
	@GetMapping("{movieId}")
	public Movie getMovie(@PathVariable int movieId) {
		Movie movie=movieService.getMovieById(movieId);
		if(movie==null)			
			throw new MovieNotFoundException("Movie ID is invalid. Please enter correct ID.");
		return movie;
	}
	
	@PostMapping("update")
	public ResponseEntity<Movie> updateMovie(@RequestBody Movie movieDetails) {
		
		Movie movie= movieService.getMovieById(movieDetails.getMovieId());
		if(movie!= null) {
		movie.setTitle("Gajini");
		movieService.addOrUpdateMovie(movie);
		}else {
			movieService.addOrUpdateMovie(movieDetails);
		}
		
		
			ResponseEntity<Movie> responseEntity = new ResponseEntity<>(movie, HttpStatus.OK);
		return responseEntity;
	}

}
