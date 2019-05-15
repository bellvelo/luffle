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
		Restaurant marthas = new Restaurant("Marthas", "Healthy", "99 St Vincent Street");
		restaurantRepository.save(marthas);
		Restaurant philpotts = new Restaurant("Philpotts", "Salads", "33 Bothwell Street");
		restaurantRepository.save(philpotts);
		Restaurant pret = new Restaurant("Pret", "Coffee", "13 Bothwell Street");
		restaurantRepository.save(pret);
		Restaurant tacobell = new Restaurant("TacoBell", "Mexican", "25 Ariba Street");
		restaurantRepository.save(tacobell);
		
		
	}

}
