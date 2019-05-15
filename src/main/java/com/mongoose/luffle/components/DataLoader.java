package com.mongoose.luffle.components;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import com.mongoose.luffle.models.Restaurant;
import com.mongoose.luffle.repositories.RestaurantRepository;

@Component
public class DataLoader implements ApplicationRunner{
	
	@Autowired
	RestaurantRepository restaurantRepository;
	
	public DataLoader() {
	}
	
	public void run(ApplicationArguments args) {
		Restaurant panko = new Restaurant("Panko", "Japanese", "123 Bothwell Street");
		restaurantRepository.save(panko);
		
	}

}
