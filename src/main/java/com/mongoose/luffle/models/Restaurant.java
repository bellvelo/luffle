package com.mongoose.luffle.models;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.Cascade;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "restaurants")
public class Restaurant {

@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private long id;

@Column(name = "name")
private String name;

@Column(name = "city")
private String city;

@Column(name = "address")
private String address;

@Column(name = "genre")
private String genre;

@JsonIgnoreProperties("restaurants")
@Cascade(org.hibernate.annotations.CascadeType.DELETE)
@OneToMany(mappedBy = "restaurant", fetch = FetchType.LAZY)
private List<Review> reviews;


public Restaurant(String name,String city, String address, String genre) {
	this.name = name;
	this.city = city;
	this.address = address;
	this.genre = genre;
	this.reviews = new ArrayList<Review>();
}

public Restaurant() {
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getGenre() {
	return genre;
}

public void setGenre(String genre) {
	this.genre = genre;
}

public String getAddress() {
	return address;
}

public void setAddress(String address) {
	this.address = address;
}

public String getCity() {
	return city;
}

public void setCity(String city) {
	this.city = city;
}

public void addReview(Review review) {
	this.reviews.add(review);
}

public List<Review> getReviews() {
	return reviews;
}

public void setReviews(List<Review> reviews) {
	this.reviews = reviews;
}



}
