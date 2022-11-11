package com.example.vannt97.FoodDeliver.entity;

import javax.persistence.*;
import java.util.Set;

@Entity(name = "t_order")
public class OrderEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @ManyToOne
    @JoinColumn(name = "id_user")
    private UserEntity userEntity;

    public UserEntity getUser() {
        return userEntity;
    }

    public void setUser(UserEntity userEntity) {
        this.userEntity = userEntity;
    }

//    @OneToMany(mappedBy = "orderEntity")
//    private Set<FoodOrderEntity> foodOrderEntities;
//
//    public Set<FoodOrderEntity> getFoodOrders() {
//        return foodOrderEntities;
//    }
//
//    public void setFoodOrders(Set<FoodOrderEntity> foodOrderEntities) {
//        this.foodOrderEntities = foodOrderEntities;
//    }

    @Column(name = "estimate_ship")
    private String estimateShip;
    @Column(name = "deliver_address")
    private String deliverAddress;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }



    public String getEstimateShip() {
        return estimateShip;
    }

    public void setEstimateShip(String estimateShip) {
        this.estimateShip = estimateShip;
    }

    public String getDeliverAddress() {
        return deliverAddress;
    }

    public void setDeliverAddress(String deliverAddress) {
        this.deliverAddress = deliverAddress;
    }
}
