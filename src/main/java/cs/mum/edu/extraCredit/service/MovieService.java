package cs.mum.edu.extraCredit.service;

import java.util.List;

import cs.mum.edu.extraCredit.model.Movie;

public interface MovieService {

	List<Movie> getAll();
	void create(Movie movie);
	void update(int id, Movie movie);
	void delete(int id);
	Movie get(int id);
}
