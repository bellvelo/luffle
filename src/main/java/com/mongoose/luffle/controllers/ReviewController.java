package com.mongoose.luffle.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mongoose.luffle.models.Review;
import com.mongoose.luffle.repositories.ReviewRepository;

@RestController
@RequestMapping(value = "/reviews")
public class ReviewController {
	
	@Autowired
	ReviewRepository reviewRepository;	

	
	@GetMapping
	public List<Review> getAllReviews() {
		return reviewRepository.findAll();
	}
	
	@GetMapping("{id}")
	public Optional<Review> getReview(@PathVariable Long id) {
		return reviewRepository.findById(id);
	}

}
