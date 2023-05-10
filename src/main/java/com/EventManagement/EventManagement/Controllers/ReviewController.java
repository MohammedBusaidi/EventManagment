package com.EventManagement.EventManagement.Controllers;

import com.EventManagement.EventManagement.Models.Reviews;
import com.EventManagement.EventManagement.Services.ReviewsServices;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "review")
public class ReviewController {
    ReviewsServices reviewsServices;
    @GetMapping(value = "getAll")
    public List<Reviews> getAllReviews() {
        return reviewsServices.getAllReviews();
    }
    @GetMapping(value = "getById")
    public Reviews getReviewById(@RequestParam Long id) {
        return reviewsServices.getReviewById(id);
        }
}
