package com.mongoose.luffle.projections;

import org.springframework.data.rest.core.config.Projection;

import com.mongoose.luffle.models.Restaurant;

@Projection(name = "embedReview", types = Restaurant.class)
public interface EmbedReview {
	String getReviewerName();
	Integer getStars();
	String getReview();

}
