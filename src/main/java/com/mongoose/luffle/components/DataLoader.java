package com.mongoose.luffle.components;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import com.mongoose.luffle.models.Restaurant;
import com.mongoose.luffle.models.Review;
import com.mongoose.luffle.repositories.RestaurantRepository;
import com.mongoose.luffle.repositories.ReviewRepository;

@Component
public class DataLoader implements ApplicationRunner{
	
	@Autowired
	RestaurantRepository restaurantRepository;
	@Autowired
	ReviewRepository reviewRepository;
	
	public DataLoader() {
	}
	
	public void run(ApplicationArguments args) {
		Restaurant panko = new Restaurant("Panko","Glasgow", "123 Bothwell Street", "Japanese");
		restaurantRepository.save(panko);
		
		Review david = new Review("David", 5, "Katsuuu", panko);
		reviewRepository.save(david);
		
		panko.addReview(david);
		restaurantRepository.save(panko);
		
		////
			
		Restaurant marthas = new Restaurant("Marthas","Glasgow", "99 St Vincent Street", "Healthy");
		restaurantRepository.save(marthas);
		
		Restaurant philpotts = new Restaurant("Philpotts","Glasgow", "33 Bothwell Street", "Salads");
		restaurantRepository.save(philpotts);
		
		Restaurant tacobell = new Restaurant("TacoBell","Edinburgh", "25 Ariba Street", "Mexican");
		restaurantRepository.save(tacobell);
		
		Restaurant pret = new Restaurant("Pret a Manger","Glasgow", "13 Bothwell Street", "Coffee");
		restaurantRepository.save(pret);
		
		
		
		Review farheen = new Review("Farheen", 4, "Nice and Healthy", marthas);
		reviewRepository.save(farheen);
		
		Review ali = new Review("Ali", 4, "Grrrrreat Java", pret);
		reviewRepository.save(ali);
		
		Review bob = new Review("Bob", 4, "Panko4Life!!", panko);
		reviewRepository.save(bob);
		
		Review jim = new Review("Jim", 4, "Give me coffee", pret);
		reviewRepository.save(jim);
		
	
		marthas.addReview(farheen);
		restaurantRepository.save(marthas);
		
		pret.addReview(ali);
		restaurantRepository.save(pret);
		
		panko.addReview(bob);
		restaurantRepository.save(panko);
		
		pret.addReview(jim);
		restaurantRepository.save(pret);
	}

}
