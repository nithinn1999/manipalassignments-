package com.example.demo.controller;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.example.demo.exception.ExceptionResponse;
import com.example.demo.exception.MovieNotFoundException;

@ControllerAdvice
public class MovieResponseEntityExceptionandler extends ResponseEntityExceptionHandler {
	@ExceptionHandler
	public ResponseEntity<ExceptionResponse> movieNotFound(MovieNotFoundException exception){
		ExceptionResponse response =new ExceptionResponse(exception.getMessage(), LocalDateTime.now());
	
		return new ResponseEntity<>(response, HttpStatus.NOT_FOUND);
	}

}
