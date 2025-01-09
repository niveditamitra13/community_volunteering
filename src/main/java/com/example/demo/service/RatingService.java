package com.example.demo.service;
import com.example.demo.entity.RatingEntity;
import com.example.demo.repository.RatingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class RatingService {

    @Autowired
    private RatingRepository ratingRepository;


    public RatingEntity createRating(RatingEntity rating) {
//        if (task.getCreatedBy() == null || task.getCreatedBy().getId() == null) {
//            throw new IllegalArgumentException("CreatedBy user must be provided");
//        }
//        userRepository.findById(task.getId())
//                .orElseThrow(() -> new RuntimeException("User not found"));
        return ratingRepository.save(rating);
    }


    public List<RatingEntity> getAllRatings() {
        return ratingRepository.findAll();
    }


    public RatingEntity getRatingById(Long id) {
        return ratingRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("rating not found"));
    }



    public RatingEntity deleteRating(Long id) {
        RatingEntity rating=ratingRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("rating not found"));
        ratingRepository.deleteById(id);
        return rating;
    }

}
