package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Movie;



@Repository
public interface IMovieRepository extends JpaRepository<Movie, Integer> {
	Movie findByTitle(String title);
	List<Movie> findByLeadRoleAndTitle(String leadRole , String title);

}
