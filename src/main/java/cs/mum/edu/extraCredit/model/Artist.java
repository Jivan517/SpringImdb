package cs.mum.edu.extraCredit.model;

import java.util.*;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;

import org.hibernate.validator.constraints.NotBlank;
import org.springframework.format.annotation.DateTimeFormat;

@Entity
@SecondaryTable(name = "ArtistImage")
public class Artist {
	
	@Id @GeneratedValue
	private int id;
	
	@NotBlank(message = "FirstName cannot be blank")
	private String firstName;
	
	@NotBlank(message = "LastName cannot be blank")
	private String lastName;
	
	@NotNull(message = "DOB cannot be blank")
	@Temporal(TemporalType.TIMESTAMP)
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@Past
	private Date dob;
	
	@NotBlank(message = "Place of Birth cannot be blank")
	private String placeOfBirth;
	
	@NotBlank(message = "Biography cannot be blank")
	@Lob
	@Column
	private String biography;
	
	@Lob
	@Column(table = "ArtistImage")
	private byte[] image;

	@ManyToMany(mappedBy = "artists")
	private List<Movie> movies = new ArrayList<>();

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public String getFullName(){
		return this.firstName + " " + this.lastName;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public String getPlaceOfBirth() {
		return placeOfBirth;
	}

	public void setPlaceOfBirth(String placeOfBirth) {
		this.placeOfBirth = placeOfBirth;
	}

	public String getBiography() {
		return biography;
	}

	public void setBiography(String biography) {
		this.biography = biography;
	}

	public byte[] getImage() {
		return image;
	}

	public void setImage(byte[] image) {
		this.image = image;
	}

	public List<Movie> getMovies() {
		return movies;
	}

	public void setMovies(List<Movie> movies) {
		this.movies = movies;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	@Override
	public String toString(){
		return this.firstName + " " + this.lastName;
	}
	
}
