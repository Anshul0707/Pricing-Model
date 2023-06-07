package com.project.pricing_model.model;

import lombok.Data;

@Data
public class Offer {
    private boolean isActive;
    private int quantity;
    private String description;

    public Offer(boolean isActive, int quantity, String description) {
        this.isActive = isActive;
        this.quantity = quantity;
        this.description = description;
    }
}
