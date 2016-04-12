package cs.mum.edu.extraCredit.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import cs.mum.edu.extraCredit.dao.DirectorDao;
import cs.mum.edu.extraCredit.model.Director;

@Transactional
public class DirectorServiceImpl implements DirectorService{
	private DirectorDao directorDao;

	@Autowired
	public void setDirectorDao(DirectorDao repository){
		this.directorDao = repository;
	}
	
	@Override
	public List<Director> getAll() {

		return directorDao.findAll();
	}

	@Override
	public void create(Director director) {

		directorDao.save(director);
	}

	@Override
	public void update(int id, Director director) {
		director.setId(id);	
		directorDao.save(director);
	}

	@Override
	public void delete(int id) {

		Director director = directorDao.findOne(id);
		directorDao.delete(director);
	}

	@Override
	public Director get(int id) {

		return directorDao.findOne(id);
	}

}

