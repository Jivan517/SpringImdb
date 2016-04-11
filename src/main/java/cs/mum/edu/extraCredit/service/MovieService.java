package cs.mum.edu.extraCredit.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import cs.mum.edu.extraCredit.dao.MovieDao;
import cs.mum.edu.extraCredit.model.Movie;

@Service
public class MovieService implements IMovieService {

	@Resource
	private MovieDao movieDao;
	

	public void setRepository(MovieDao repository){
		this.movieDao = repository;
	}
	
	
	public void createMovie(Movie movie){
	
		try {
			
			movieDao.save(movie);
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public List<Movie> getAll(){
		
		try {
			
			List<Movie> movieList = (List<Movie>) movieDao.findAll();
			return movieList;
			
		} catch (Exception e) {
			e.printStackTrace();
			throw new IllegalArgumentException(e);
		}
	}
	
	
}
