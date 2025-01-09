package com.example.demo.entity;

import jakarta.persistence.*;
//import lombok.AllArgsConstructor;
//import lombok.Data;
//import lombok.NoArgsConstructor;

@Entity
//@Data
//@NoArgsConstructor
//@AllArgsConstructor
public class RatingEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Double score;

    @ManyToOne
    private UserEntity ratedBy;

    @ManyToOne
    private UserEntity ratedUser;

    private String comments;



    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }



    public Double getScore() {
        return score;
    }
    public void setScore(Double score) {
        this.score = score;
    }




    public UserEntity getRatedBy() {
        return ratedBy;
    }
    public void setRatedBy(UserEntity ratedBy) {
        this.ratedBy = ratedBy;
    }


    public UserEntity getRatedUser() {
        return ratedUser ;
    }
    public void setRatedUser(UserEntity ratedUser) {
        this.ratedUser = ratedUser;
    }


    public String getComments() {
        return comments;
    }
    public void setComments(String comments) {
        this.comments = comments;
    }

}
