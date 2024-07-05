package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ShippingCostTest {

    @Test
    public void testLowWeightShortDist() {
        double totalWeight = 3.0;
        double distance = 30.0;
        double expected = 10.0;
        double actual = ShippingCost.calculateShippingCost(totalWeight, distance);

        System.out.println("Test: Low weight (3.0 kg) and short distance (30.0 km)");
        System.out.printf("Expected: $%.2f, Actual: $%.2f\n", expected, actual);

        assertEquals(expected, actual, 0.01);
    }

    @Test
    public void testMediumWeightMediumDist() {
        double totalWeight = 15.0;
        double distance = 100.0;
        double expected = 30.0;
        double actual = ShippingCost.calculateShippingCost(totalWeight, distance);

        System.out.println("Test: Medium weight (15.0 kg) and medium distance (100.0 km)");
        System.out.printf("Expected: $%.2f, Actual: $%.2f\n", expected, actual);

        assertEquals(expected, actual, 0.01);
    }

    @Test
    public void testHighWeightLongDist() {
        double totalWeight = 25.0;
        double distance = 250.0;
        double expected = 60.0;
        double actual = ShippingCost.calculateShippingCost(totalWeight, distance);

        System.out.println("Test: High weight (25.0 kg) and long distance (250.0 km)");
        System.out.printf("Expected: $%.2f, Actual: $%.2f\n", expected, actual);

        assertEquals(expected, actual, 0.01);
    }

    @Test
    public void testBoundaryWeightLow() {
        double totalWeight = 5.0;
        double distance = 30.0;
        double expected = 10.0;
        double actual = ShippingCost.calculateShippingCost(totalWeight, distance);

        System.out.println("Test: Boundary weight (5.0 kg) and short distance (30.0 km)");
        System.out.printf("Expected: $%.2f, Actual: $%.2f\n", expected, actual);

        assertEquals(expected, actual, 0.01);
    }

    @Test
    public void testBoundaryDistanceHigh() {
        double totalWeight = 20.0;
        double distance = 200.0;
        double expected = 30.0;
        double actual = ShippingCost.calculateShippingCost(totalWeight, distance);

        System.out.println("Test: High weight (20.0 kg) and boundary distance (200.0 km)");
        System.out.printf("Expected: $%.2f, Actual: $%.2f\n", expected, actual);

        assertEquals(expected, actual, 0.01);
    }
}
