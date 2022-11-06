package com.example.vannt97.FoodDeliver.controller;

import com.example.vannt97.FoodDeliver.entity.*;
import com.example.vannt97.FoodDeliver.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class TestController {

    @Autowired
    CategoryService categoryService;
    @Autowired
    FoodService foodService;
    @Autowired
    FoodAddOnsService foodAddOnsService;
    @Autowired
    FoodDetailService foodDetailService;
    @Autowired
    FoodOrderService foodOrderService;
    @Autowired
    FoodReviewService foodReviewService;
    @Autowired
    MaterialService materialService;
    @Autowired
    RestaurantService restaurantService;
    @Autowired
    RestaurantReviewService restaurantReviewService;
    @Autowired
    OrderService orderService;
    @Autowired
    StatusService statusService;

    @Autowired
    UserService userService;
    @Autowired
    UserDetailService userDetailService;
    @GetMapping("/categories")
    public List<Category> getCategories(){
        return categoryService.getAll();
    }

    @GetMapping("/foods")
    public List<Food> getAllFoods(){ return foodService.getAllFoods();}

    @GetMapping("/food-add-ons")
    public List<FoodAddOns> getAllFoodAddOns(){ return foodAddOnsService.getAllFoodAddOns();}

    @GetMapping("/food-details")
    public List<FoodDetail> getAllFoodDetails(){ return foodDetailService.getAllFoodDetails();}

    @GetMapping("/food-orders")
    public List<FoodOrder> getAllFoodOrders(){ return foodOrderService.getAllFoodOrders();}

    @GetMapping("/food-reviews")
    public  List<FoodReview> getAllFoodReviews(){return foodReviewService.getAllFoodReviews();}

    @GetMapping("/materials")
    public  List<Material> getAllMaterials(){return materialService.getALlMaterials();}

    @GetMapping("/restaurants")
    public List<Restaurant> getAllRestaurants(){ return restaurantService.getAllRestaurants();}

    @GetMapping("/restaurant-reviews")
    public List<RestaurantReview> getALlRestaurantReviews(){return  restaurantReviewService.getAllRestaurantReviews();}

    @GetMapping("/status")
    public List<Status> getALlStatus(){ return statusService.getALlStatus();}

    @GetMapping("/orders")
    public List<Order> getAllOrders(){
        return  orderService.getAllOrders();
    }
    @GetMapping("/users")
    public List<User> getAllUsers(){ return userService.getAllUsers();}
    @GetMapping("/user-details")
    public List<UserDetail> getAllUserDetails() {return userDetailService.getAlluserDetails();}
}
