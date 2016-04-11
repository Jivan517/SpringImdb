package cs.mum.edu.extraCredit.dao;

import java.util.*;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import cs.mum.edu.extraCredit.model.Artist;

@Repository
public interface ArtistDao extends JpaRepository<Artist, Integer>{

	List<Artist> findByFirstName(String firstName);
	List<Artist> findByLastName(String lastName);
	
}
