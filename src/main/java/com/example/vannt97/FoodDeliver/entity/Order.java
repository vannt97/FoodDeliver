package com.example.vannt97.FoodDeliver.entity;

import javax.persistence.*;
import java.util.Set;

@Entity(name = "t_order")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @ManyToOne
    @JoinColumn(name = "id_user")
    private User user;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @OneToMany(mappedBy = "order")
    private Set<FoodOrder> foodOrders;

    public Set<FoodOrder> getFoodOrders() {
        return foodOrders;
    }

    public void setFoodOrders(Set<FoodOrder> foodOrders) {
        this.foodOrders = foodOrders;
    }

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
