package net.nitrado.api.order.products;

import net.nitrado.api.Nitrapi;
import net.nitrado.api.order.PartPricing;

public class MusicbotProduct extends PartPricing {
    public MusicbotProduct(Nitrapi nitrapi, int locationId) {
        super(nitrapi, locationId);
        product = "musicbot";
    }
}
