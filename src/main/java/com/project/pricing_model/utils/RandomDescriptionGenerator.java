package com.project.pricing_model.utils;

import java.util.Random;

public class RandomDescriptionGenerator {

    private static final String[] descriptionForSubscription =
            {"Freelancers", "Teams", "Students", "Organization",
                    "agencies"};
    private static final String[] types = {"gold", "silver", "platinum", "free"};
    private static String[] descriptionForOffer =
            {"Users", "Downloader per month", "Roster Files", "Unlimited Downlodes",
                    "Fully-Editable Files", "Custom Packs", "200+ Custom Icons"};

    public static String getDescriptionForOffer() {
        Random random = new Random();
        int randomIndex = random.nextInt(descriptionForOffer.length);
        return descriptionForOffer[randomIndex];
    }

    public static String getDescriptionForSubscription() {
        Random random = new Random();
        int randomIndex = random.nextInt(descriptionForSubscription.length);
        return descriptionForSubscription[randomIndex];
    }

    public static String getTypes() {
        Random random = new Random();
        int randomIndex = random.nextInt(types.length);
        return types[randomIndex];
    }

}
