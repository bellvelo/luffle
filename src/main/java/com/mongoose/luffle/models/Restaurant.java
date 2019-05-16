package com.mongoose.luffle.models;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "restaurants")
public class Restaurant implements Serializable {

@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
@Column(name = "id")
private long id;

@Column(name = "name")
private String name;

@Column(name = "genre")
private String genre;

@Column(name = "address")
private String address;

//@Cascade(org.hibernate.annotations.CascadeType.DELETE)
//@OneToMany(mappedBy = "restaurants", fetch = FetchType.LAZY)
//private List<Review> reviews;

@OneToMany(cascade = CascadeType.ALL,
fetch = FetchType.LAZY,
mappedBy = "restaurant")
private List<Review> reviews = new ArrayList<>();

public Restaurant(String name, String genre, String address) {
	this.name = name;
	this.genre = genre;
	this.address = address;
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

public void addReview(Review review) {
	this.reviews.add(review);
}


}
