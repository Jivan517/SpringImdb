package cs.mum.edu.extraCredit.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.SimpleTypeConverter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import cs.mum.edu.extraCredit.model.Artist;
import cs.mum.edu.extraCredit.model.Director;
import cs.mum.edu.extraCredit.model.Genre;
import cs.mum.edu.extraCredit.model.Movie;
import cs.mum.edu.extraCredit.model.Rating;
import cs.mum.edu.extraCredit.service.ArtistService;
import cs.mum.edu.extraCredit.service.DirectorService;
import cs.mum.edu.extraCredit.service.MovieService;

@Controller
public class MovieController  {

	@Autowired
	private MovieService movieService;
	
	@Autowired
	private ArtistService artistService;
	
	@Autowired
	private DirectorService directorService;

	public void setMovieService(MovieService movieService) {
		this.movieService = movieService;
	}

	@RequestMapping(value = {"/", "/movies"}, method = RequestMethod.GET)
	public String index(Model model) {

		List<Movie> movieList = movieService.getAll();
		model.addAttribute("movieList", movieList);

		return "Movie/movieList";
	}

	@RequestMapping(value = "/movies/add", method = RequestMethod.GET)
	public String add(Model model) {
		
		Movie movie = new Movie();
		Genre[] genres = Genre.values();
		movie.setGenres(Arrays.asList(genres));
		
		Rating[] ratings = Rating.values();
		
		
		List<Artist> artists = artistService.getAll();
		movie.setArtists(artists);
		
		List<Director> directors = directorService.getAll();
		movie.setDirectors(directors);
		
		model.addAttribute("movie", movie);
		model.addAttribute("ratings", Arrays.asList(ratings));
		return "Movie/addMovie";
	}

	@RequestMapping(value = "/movies/add", method = RequestMethod.POST)
	public String add(@Valid Movie movie, BindingResult result) {

		System.out.println(result.hasErrors());
		if(result.hasErrors())
			return "Movie/addMovie";
		
		movieService.create(movie);
		return "redirect:/movies";
	}
	
	@RequestMapping(value = "/movies/update/{id}", method = RequestMethod.GET)
	public String update(@PathVariable int id, Model model){
		
		Movie movie = movieService.get(id);
		model.addAttribute("movie", movie);
		
		Rating[] ratings = Rating.values();
		model.addAttribute("ratings", Arrays.asList(ratings));
		
		Genre[] genres = Genre.values();
		model.addAttribute("genres", Arrays.asList(genres));
		
		model.addAttribute("artists", artistService.getAll());
		model.addAttribute("directors", directorService.getAll());
		
		
		return "Movie/updateMovie";
	}
	
	@RequestMapping(value = "/movies/update/{id}", method = RequestMethod.POST)
	public String update(@Valid Movie movie,@PathVariable int id, BindingResult result){
		
		if(result.hasErrors())
			return "redirect:/movies/update/" + id;
		
		movieService.update(id, movie);
		
		return "redirect:/movies";
	}
	
	@RequestMapping(value = "/movies/delete/{id}", method = RequestMethod.POST )
	public String delete(@PathVariable int id){
		
		movieService.delete(id);
		return "redirect:/movies";
	}
	

}
