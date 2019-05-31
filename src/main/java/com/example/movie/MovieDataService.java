package com.example.movie;



public interface MovieDataService {
	
	
		Movie getMovieById(Integer id);
		Movie addMovie(Movie Movie);
		Movie updateMovie(Movie Movie);
		void deleteMovie(Movie Movie);
		
		
		
		
	
	

}
