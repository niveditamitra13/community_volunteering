package com.example.demo.controller;
import com.example.demo.entity.RatingEntity;
import com.example.demo.service.RatingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/api/ratings")
public class RatingController {

    @Autowired
    private RatingService ratingService;


    @PostMapping
    public RatingEntity createRating(@RequestBody RatingEntity rating) {
        return ratingService.createRating(rating);
    }


    @GetMapping
    public List<RatingEntity> getAllRatings() {
        return ratingService.getAllRatings();
    }


    @GetMapping("/{id}")
    public RatingEntity getRatingById(@PathVariable Long id) {
        return ratingService.getRatingById(id);
    }


    @DeleteMapping("/{id}")
    public RatingEntity deleteRating(@PathVariable Long id) {
        return ratingService.deleteRating(id);
    }
}