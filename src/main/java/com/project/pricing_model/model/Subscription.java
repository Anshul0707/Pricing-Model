package com.project.pricing_model.model;

import lombok.Data;

import java.util.List;

@Data
public class Subscription {
    private String type;
    private String description;
    private List<Offer> offers;

    public Subscription(String type, String description, List<Offer> offers) {
        this.type = type;
        this.description = description;
        this.offers = offers;
    }
}
