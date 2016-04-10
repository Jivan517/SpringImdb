package cs.mum.edu.extraCredit.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.*;

import cs.mum.edu.extraCredit.model.Genre;
import cs.mum.edu.extraCredit.model.Movie;

public interface MovieDao extends JpaRepository<Movie, Integer>{

	List<Movie> findByName(String name);
	List<Movie> findByYear(String year);
	List<Movie> findByGenres(Genre genre);
}
