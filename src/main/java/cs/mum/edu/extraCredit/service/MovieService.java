package cs.mum.edu.extraCredit.service;

import org.springframework.stereotype.Service;

import cs.mum.edu.extraCredit.dao.MovieDao;
import cs.mum.edu.extraCredit.model.Movie;

@Service
public class MovieService {

	private MovieDao movieDao;
	
	public MovieService(MovieDao movieDao){
		this.movieDao = movieDao;
	}
	
	
	public void createMovie(Movie movie){
	
		try {
			
			movieDao.save(movie);
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}
