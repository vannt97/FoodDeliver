package com.example.vannt97.FoodDeliver.entity;

import javax.persistence.*;

@Entity(name = "food")
public class FoodEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "image")
    private String image;

    @Column(name = "price")
    private int price;
    @ManyToOne
    @JoinColumn(name = "id_category")
    private CategoryEntity categoryEntity;

    @ManyToOne
    @JoinColumn(name = "id_restaurant")
    private RestaurantEntity restaurantEntity;

//    @JsonIgnore
//    @OneToOne(mappedBy = "foodEntity")
//    @PrimaryKeyJoinColumn
//    private FoodDetail foodDetail;
//
//    public FoodDetail getFoodDetail() {
//        return foodDetail;
//    }
//
//    public void setFoodDetail(FoodDetail foodDetail) {
//        this.foodDetail = foodDetail;
//    }

//    @OneToMany(mappedBy = "foodEntity")
//    private Set<FoodReview> foodReviews;
//
//    public Set<FoodReview> getFoodReviews() {
//        return foodReviews;
//    }
//
//    public void setFoodReviews(Set<FoodReview> foodReviews) {
//        this.foodReviews = foodReviews;
//    }

//    @OneToMany(mappedBy = "foodEntity")
//    private Set<FoodOrder> foodOrders;
//
//    public Set<FoodOrder> getFoodOrders() {
//        return foodOrders;
//    }
//
//    public void setFoodOrders(Set<FoodOrder> foodOrders) {
//        this.foodOrders = foodOrders;
//    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public CategoryEntity getCategory() {
        return categoryEntity;
    }

    public void setCategory(CategoryEntity categoryEntity) {
        this.categoryEntity = categoryEntity;
    }

    public RestaurantEntity getRestaurant() {
        return restaurantEntity;
    }

    public void setRestaurant(RestaurantEntity restaurantEntity) {
        this.restaurantEntity = restaurantEntity;
    }
}
