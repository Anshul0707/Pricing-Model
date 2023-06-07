package com.project.pricing_model.model;

import lombok.Data;

import java.util.List;

@Data
public class Card {
    private List<Subscription> subscriptions;
    public Card(List<Subscription> subscriptions) {
        this.subscriptions = subscriptions;
    }
}
