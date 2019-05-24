package com.mongoose.luffle.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.mongoose.luffle.models.Restaurant;
import com.mongoose.luffle.projections.EmbedReview;


@RepositoryRestResource(excerptProjection = EmbedReview.class)
public interface RestaurantRepository extends JpaRepository<Restaurant, Long> {
}
