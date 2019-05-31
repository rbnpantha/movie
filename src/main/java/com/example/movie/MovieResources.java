package com.example.movie;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping ({"/movie"})
public class MovieResources {
	@Autowired
	
	private MovieDataService movieDataService;
	
	
	
	
	@RequestMapping (value="/{id}", method=RequestMethod.GET, produces=MediaType.APPLICATION_JSON_VALUE)
	public Movie getMovie(@PathVariable("id") Integer id){/*
		String pattern = "{ \"id\":\"01\", \"title\":\"ET\", \"director\":\"Steven Spielberg\"}";
		String json = String.format(pattern, id, title, director);
		System.out.println(json);
		return json;*/
	System.out.println("The question id received by REST is : " + id);
        return   movieDataService.findById(id);
		}
		
	
	@RequestMapping (value="/update", method=RequestMethod.PUT, produces=MediaType.APPLICATION_JSON_VALUE)

	public String updateMovie(int id, int title, int director) {
		this.id = id;
		this.title = title;
		this.director = director;
		String pattern = "{ \"id\":\"01\", \"title\":\"ET\", \"director\":\"Steven Spielberg\"}";
		String json = String.format(pattern, id, title, director);
		System.out.println(json);
		return json;
		}
		
		

	
	
	@RequestMapping(value="/movie/id", method=RequestMethod.GET)
	
	public int getId() {
		return id;
	}

	@RequestMapping(value="/movie/title", method=RequestMethod.GET)

	public int getTitle() {
		return title;
	}

	@RequestMapping(value="/movie/director", method=RequestMethod.GET)

	public int getDirector() {
		return director;
		
		
	}


	public void setId(int id) {
		this.id = id;
	}


	public void setTitle(int title) {
		this.title = title;
	}


	public void setDirector(int director) {
		this.director = director;
	}
	

}
