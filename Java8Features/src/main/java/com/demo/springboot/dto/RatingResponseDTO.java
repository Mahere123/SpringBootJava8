package com.demo.springboot.dto;

public class RatingResponseDTO {
	
	private String customerId;
	
	private String rating;
	
	private String firstName;
	
	private String lastName;
	
	private String movieId;

	public RatingResponseDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public RatingResponseDTO(String customerId, String rating, String firstName, String lastName, String movieId) {
		super();
		this.customerId = customerId;
		this.rating = rating;
		this.firstName = firstName;
		this.lastName = lastName;
		this.movieId = movieId;
	}

	public String getCustomerId() {
		return customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	public String getRating() {
		return rating;
	}

	public void setRating(String rating) {
		this.rating = rating;
	}

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

	public String getMovieId() {
		return movieId;
	}

	public void setMovieId(String movieId) {
		this.movieId = movieId;
	}

	
}
