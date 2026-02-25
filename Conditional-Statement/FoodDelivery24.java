import java.util.Scanner;

public class FoodDelivery24 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double distanceMiles = sc.nextDouble();
        double orderValue = sc.nextDouble();
        String timeSlot = sc.next();
        String weatherCondition = sc.next();

        double baseFee = 3.0;
        double distanceSurcharge = distanceMiles * 1.0;

        double peakSurcharge = 0.0;
        if (timeSlot.equalsIgnoreCase("Breakfast")) {
            peakSurcharge = 0.0;
        } else if (timeSlot.equalsIgnoreCase("Lunch")) {
            peakSurcharge = 2.5;
        } else if (timeSlot.equalsIgnoreCase("Dinner")) {
            peakSurcharge = 2.0;
        } else if (timeSlot.equalsIgnoreCase("Late-Night")) {
            peakSurcharge = 1.5;
        }
        double weatherSurcharge = 0.0;
        if (weatherCondition.equalsIgnoreCase("Clear")) {
            weatherSurcharge = 0.0;
        } else if (weatherCondition.equalsIgnoreCase("Rain")) {
            weatherSurcharge = 2.0;
        } else if (weatherCondition.equalsIgnoreCase("Snow")) {
            weatherSurcharge = 3.0;
        } else if (weatherCondition.equalsIgnoreCase("Storm")) {
            weatherSurcharge = 5.0;
        }

        double discount = 0.0;
        if (orderValue >= 30 && orderValue < 50) {
            discount = 1.0;
        } else if (orderValue >= 50 && orderValue < 75) {
            discount = 3.0;
        } else if (orderValue >= 75) {
            discount = 5.0;
        }

        double finalFee = baseFee + distanceSurcharge + peakSurcharge + weatherSurcharge - discount;

        if (finalFee < 2.99) {
            finalFee = 2.99;
        }

        int estimatedTime = (int)(distanceMiles * 8);

        if (timeSlot.equalsIgnoreCase("Lunch") || timeSlot.equalsIgnoreCase("Dinner")) {
            estimatedTime += 10;
        }

        if (weatherCondition.equalsIgnoreCase("Rain")) {
            estimatedTime += 5;
        } else if (weatherCondition.equalsIgnoreCase("Snow")) {
            estimatedTime += 10;
        } else if (weatherCondition.equalsIgnoreCase("Storm")) {
            estimatedTime += 15;
        }
        String priority;
        if (orderValue > 60) {
            priority = "Express";
        } else if (timeSlot.equalsIgnoreCase("Lunch") || timeSlot.equalsIgnoreCase("Dinner")) {
            priority = "High";
        } else {
            priority = "Standard";
        }
        System.out.println();
        System.out.println("Delivery Distance: " + distanceMiles + " miles");
        System.out.println("Order Value: $" + orderValue);
        System.out.println("Time Slot: " + timeSlot);
        System.out.println("Weather Condition: " + weatherCondition);
        System.out.println("Base Delivery Fee: $" + baseFee);
        System.out.println("Distance Surcharge: $" + distanceSurcharge);
        System.out.println("Peak Time Surcharge: $" + peakSurcharge);
        System.out.println("Weather Surcharge: $" + weatherSurcharge);
        System.out.println("Order Value Discount: $" + discount);
        System.out.println("Final Delivery Fee: $" + finalFee);
        System.out.println("Estimated Delivery Time: " + estimatedTime + " minutes");
        System.out.println("Service Priority: " + priority);

        sc.close();
    }
}