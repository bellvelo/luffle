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
	ReviewRepository reviewRepository;
	
	public DataLoader() {
	}
	
	public void run(ApplicationArguments args) {
		Restaurant panko = new Restaurant("Panko", "Japanese", "123 Bothwell Street");
		restaurantRepository.save(panko);
			
		Restaurant marthas = new Restaurant("Marthas", "Healthy", "99 St Vincent Street");
		restaurantRepository.save(marthas);
		
		Restaurant philpotts = new Restaurant("Philpotts", "Salads", "33 Bothwell Street");
		restaurantRepository.save(philpotts);
		
		Restaurant tacobell = new Restaurant("TacoBell", "Mexican", "25 Ariba Street");
		restaurantRepository.save(tacobell);
		
		Restaurant pret = new Restaurant("Pret", "Coffee", "13 Bothwell Street");
		restaurantRepository.save(pret);
		
//		Review david = new Review("David", 5, "Grrrrreat Java");
//		reviewRepository.save(david);
//		
//		pret.addReview(david);
		
	}

}
