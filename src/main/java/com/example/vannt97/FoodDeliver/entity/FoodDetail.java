package com.example.vannt97.FoodDeliver.entity;

import javax.persistence.*;

@Entity(name = "food_detail")
public class FoodDetail {
    @Id
    @Column(name = "id_food")
    private int id;
    @Column(name = "description")
    private String description;
    @Column(name = "create_date")
    private String createDate;
    @Column(name = "rating")
    private float rating;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCreateDate() {
        return createDate;
    }

    public void setCreateDate(String createDate) {
        this.createDate = createDate;
    }

    public float getRating() {
        return rating;
    }

    public void setRating(float rating) {
        this.rating = rating;
    }
}
