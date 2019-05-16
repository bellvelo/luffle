package com.mongoose.luffle.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mongoose.luffle.models.Restaurant;


@Repository
public interface RestaurantRepository extends JpaRepository<Restaurant, Long> {
}
