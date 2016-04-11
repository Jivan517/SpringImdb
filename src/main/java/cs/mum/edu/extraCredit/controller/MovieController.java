package cs.mum.edu.extraCredit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import cs.mum.edu.extraCredit.model.Movie;
import cs.mum.edu.extraCredit.service.IMovieService;

@Controller
public class MovieController {

	@Autowired
	private IMovieService movieService;
	
	public void setMovieService(IMovieService movieService){
		this.movieService = movieService;
	}
	
	@RequestMapping("/")
	public String redirectRoot() {
		return "redirect:/movies";
	}
	
	
	@RequestMapping(value = {"/movies"}, method = RequestMethod.GET)
	public String index(){
		
		return "movieList";
	}
	
	@RequestMapping(value = "/addMovie", method = RequestMethod.GET)
	public String addMovie(){
		
		return "addMovie";
		
	}
	
	@RequestMapping(value = "/addMovie", method = RequestMethod.POST)
	public String addMovie(Movie movie){
		
		
		
		return "redirect: /movies";
		
	}
	
}
