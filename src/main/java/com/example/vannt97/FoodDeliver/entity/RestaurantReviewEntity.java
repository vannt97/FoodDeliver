package com.example.vannt97.FoodDeliver.entity;

import javax.persistence.*;

@Entity(name = "restaurant_review")
public class RestaurantReviewEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @ManyToOne
    @JoinColumn(name = "id_restaurant")
    private RestaurantEntity restaurantEntity;

    public RestaurantEntity getRestaurant() {
        return restaurantEntity;
    }

    public void setRestaurant(RestaurantEntity restaurantEntity) {
        this.restaurantEntity = restaurantEntity;
    }

    private String content;
    private float rate;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public float getRate() {
        return rate;
    }

    public void setRate(float rate) {
        this.rate = rate;
    }
}
