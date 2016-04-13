package cs.mum.edu.extraCredit.service;

import java.util.List;

import cs.mum.edu.extraCredit.model.Genre;
import cs.mum.edu.extraCredit.model.Movie;
import cs.mum.edu.extraCredit.model.Rating;

public interface MovieService {

	List<Movie> getAll();
	void create(Movie movie);
	void update(int id, Movie movie);
	void delete(int id);
	Movie get(int id);
	
	List<Movie> findByName(String name);
	List<Movie> findByYear(int year);
	List<Movie> findByGenres(String genres);
	List<Movie> findByRating(Rating rating)	;
	List<Movie> findByArtists(String name);	
	List<Movie> findByDirectors(String name);
}
