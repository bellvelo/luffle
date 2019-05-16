package com.mongoose.luffle.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mongoose.luffle.models.Review;

@Repository
public interface ReviewRepository extends JpaRepository<Review, Long> {
}
