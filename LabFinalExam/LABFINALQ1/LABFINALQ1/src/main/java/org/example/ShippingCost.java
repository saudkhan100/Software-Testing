package org.example;

public class ShippingCost {

    public static double calculateShippingCost(double totalWeight, double distance) {
        double baseShippingCost = 5.0;
        double weightCost = 0.0;
        double distanceCost = 0.0;

        // Calculate weight cost
        if (totalWeight <= 5) {
            weightCost = 5.0;
        } else if (totalWeight <= 20) {
            weightCost = 10.0;
        } else {
            weightCost = 25.0;
        }

        // Calculate distance cost
        if (distance > 200) {
            distanceCost = 30.0;
        } else if (distance > 50) {
            distanceCost = 15.0;
        }

        // Calculate total shipping cost
        double shippingCost = baseShippingCost + weightCost + distanceCost;
        return shippingCost;
    }
}
