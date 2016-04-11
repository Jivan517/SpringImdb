package cs.mum.edu.extraCredit.service;

import java.util.List;

import cs.mum.edu.extraCredit.model.Movie;

public interface IMovieService {

	void createMovie(Movie movie);
	List<Movie> getAll();
}
