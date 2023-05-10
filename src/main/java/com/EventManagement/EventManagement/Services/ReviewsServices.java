package com.EventManagement.EventManagement.Services;

import com.EventManagement.EventManagement.Models.Reviews;
import com.EventManagement.EventManagement.Repositories.ReviewRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class ReviewsServices {
    final ReviewRepository reviewRepository;
    public List<Reviews> getAllReviews() {

        return reviewRepository.findAll();
    }
    public Reviews getReviewById(Long id) {

        return reviewRepository.findById(id).get();
    }
}
