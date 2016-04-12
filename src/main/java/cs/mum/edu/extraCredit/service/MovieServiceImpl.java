package cs.mum.edu.extraCredit.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import cs.mum.edu.extraCredit.dao.MovieDao;
import cs.mum.edu.extraCredit.model.Movie;

@Transactional
public class MovieServiceImpl implements MovieService {

	private MovieDao movieDao;

	@Autowired
	public void setMovieDao(MovieDao repository){
		this.movieDao = repository;
	}
	
	@Override
	public List<Movie> getAll() {

		return movieDao.findAll();
	}

	@Override
	public void create(Movie movie) {

		movieDao.save(movie);
	}

	@Override
	public void update(int id, Movie movie) {
		movie.setId(id);	
		movieDao.save(movie);
	}

	@Override
	public void delete(int id) {

		Movie movie = movieDao.findOne(id);
		movieDao.delete(movie);
	}

	@Override
	public Movie get(int id) {

		return movieDao.findOne(id);
	}

}
