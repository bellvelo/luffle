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
			
		Restaurant marthas = new Restaurant("Marthas","Glasgow", "99 St Vincent Street", "Healthy");
		restaurantRepository.save(marthas);
		
		Restaurant philpotts = new Restaurant("Philpotts","Glasgow", "33 Bothwell Street", "Salads");
		restaurantRepository.save(philpotts);
		
		Restaurant tacobell = new Restaurant("TacoBell","Edinburgh", "25 Ariba Street", "Mexican");
		restaurantRepository.save(tacobell);
		
		Restaurant pret = new Restaurant("Pret","Glasgow", "13 Bothwell Street", "Coffee");
		restaurantRepository.save(pret);
		
		Review david = new Review(panko, "David", 5, "Grrrrreat Java");
		reviewRepository.save(david);
		Review david2 = new Review(panko, "David2", 1, "Grrrrreat Java");
		reviewRepository.save(david2);
		Review david3 = new Review(panko, "David3", 2, "Grrrrreat Java");
		reviewRepository.save(david3);
		
//		pret.addReview(david);
		
	}

}
