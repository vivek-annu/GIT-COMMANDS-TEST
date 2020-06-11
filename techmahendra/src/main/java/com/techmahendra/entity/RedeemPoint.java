package com.techmahendra.entity;

import javax.persistence.*;

@Entity
@Table
public class RedeemPoint {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String customerId;
    private String newPoints;

    public RedeemPoint(Integer id, String customerId, String newPoints) {

        this.customerId = customerId;
        this.newPoints = newPoints;
    }

    public RedeemPoint() {
    }

    @Override
    public String toString() {
        return "RedeemPoint{" +
                "id=" + id +
                ", customerId='" + customerId + '\'' +
                ", newPoints='" + newPoints + '\'' +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getNewPoints() {
        return newPoints;
    }

    public void setNewPoints(String newPoints) {
        this.newPoints = newPoints;
    }
}
