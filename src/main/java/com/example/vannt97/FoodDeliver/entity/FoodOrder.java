package com.example.vannt97.FoodDeliver.entity;

import com.example.vannt97.FoodDeliver.embedded.FoodOrderKey;

import javax.persistence.*;

@Entity(name = "food_order")
public class FoodOrder {
    @EmbeddedId
    private FoodOrderKey foodOrderKey;

    public FoodOrderKey getFoodOrderKey() {
        return foodOrderKey;
    }

    public void setFoodOrderKey(FoodOrderKey foodOrderKey) {
        this.foodOrderKey = foodOrderKey;
    }

    //    @Id
//    @Column(name = "id_order")
//    private int idOrder;
//    @Column(name = "id_food")
//    private int idFood;
    @Column(name = "price")
    private float price;
    @Column(name = "quality")
    private int quality;
    @Column(name = "id_promo")
    private int id_promo;

//    public int getIdOrder() {
//        return idOrder;
//    }
//
//    public void setIdOrder(int idOrder) {
//        this.idOrder = idOrder;
//    }
//
//    public int getIdFood() {
//        return idFood;
//    }
//
//    public void setIdFood(int idFood) {
//        this.idFood = idFood;
//    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public int getQuality() {
        return quality;
    }

    public void setQuality(int quality) {
        this.quality = quality;
    }

    public int getId_promo() {
        return id_promo;
    }

    public void setId_promo(int id_promo) {
        this.id_promo = id_promo;
    }
}
