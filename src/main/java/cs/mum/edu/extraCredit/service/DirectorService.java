package cs.mum.edu.extraCredit.service;

import java.util.List;

import cs.mum.edu.extraCredit.model.Director;

public interface DirectorService {

	List<Director> getAll();
	void create(Director director);
	void update(int id, Director director);
	void delete(int id);
	Director get(int id);
}
