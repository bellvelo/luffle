package com.mongoose.luffle.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mongoose.luffle.models.Restaurant;
import com.mongoose.luffle.repositories.RestaurantRepository;



@RestController
@RequestMapping(value = "/restaurants")
public class RestaurantController {
	
	@Autowired
	RestaurantRepository restaurantRepository;
	
	@GetMapping
	public List<Restaurant> getAllRestaurants() {
		return restaurantRepository.findAll();
	}

}