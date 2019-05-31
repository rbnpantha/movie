package com.example.movie;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;



public class MovieDatasServiceImpl implements MovieDataService {
	
	
	@Autowired
	private MovieDAO movieDAO;



	@Override
	public Movie getMovieById(Integer id) {
	    Optional<Movie> movieOptional = movieDAO.findById(id);
	    return movieOptional.get();
	}

	@Override
	public Movie addMovie(Movie movie) {
	    return movieDAO.save(movie);
	}

	@Override
	public Movie updateMovie(Movie Movie) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteMovie(Movie movie) {
	        movieDAO.delete(movie);
	        }

	/*@Override
	public Movie updateMovie(Movie movie) {
	    return null;*/

	}


