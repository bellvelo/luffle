package com.mongoose.luffle.models;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Restaurants")
public class Restaurant implements Serializable {

@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private long id;

@Column(name = "name")
private String name;

@Column(name = "genre")
private String genre;

@Column(name = "address")
private String address;


public Restaurant(String name, String genre, String address) {
	this.name = name;
	this.genre = genre;
	this.address = address;
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



}
