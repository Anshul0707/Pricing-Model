package com.project.pricing_model.service;

import com.project.pricing_model.model.Card;
import com.project.pricing_model.model.Offer;
import com.project.pricing_model.model.Subscription;
import com.project.pricing_model.utils.RandomDescriptionGenerator;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
public class PricingServiceImpl implements PricingService {
    private Card card;

    public PricingServiceImpl() {

    }

    private static Offer buildOffer(boolean active, int quantity, String text) {
        return new Offer(active, quantity, text);
    }

    private static Subscription buildSubscription(String type, String description, List<Offer> offers) {
        return new Subscription(type, description, offers);
    }

    @Override
    public Card getCard() {
        List<Offer> offers = new ArrayList<>();
        for (int i = 0; i < 2; i++) {
            offers.add(buildOffer(true, i * 10, RandomDescriptionGenerator.getDescriptionForOffer()));
        }

        ArrayList<Subscription> subscriptions = new ArrayList<>();
        for (int i = 0; i < 1; i++) {
            subscriptions.add(buildSubscription(RandomDescriptionGenerator.getTypes(), RandomDescriptionGenerator.getDescriptionForSubscription(), offers));
        }
        card = new Card(subscriptions);

        return card;
    }
}
