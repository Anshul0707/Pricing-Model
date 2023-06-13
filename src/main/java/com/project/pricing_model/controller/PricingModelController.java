package com.project.pricing_model.controller;

import com.project.pricing_model.model.Card;
import com.project.pricing_model.service.PricingService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/pricing")
public class PricingModelController {
    private PricingService pricingService;

    public PricingModelController(PricingService pricingService) {
        this.pricingService = pricingService;
    }

    @GetMapping("/card")
    public Card getCard() {

        return pricingService.getCard();
    }
}
