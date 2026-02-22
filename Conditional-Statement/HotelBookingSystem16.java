import java.util.Scanner;

public class HotelBookingSystem16 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String roomCategory = sc.next();
        String season = sc.next();
        int nightsBooked = sc.nextInt();
        String loyaltyTier = sc.next();

        double baseRate = 0;
        double seasonalMultiplier = 1.0;
        int extendedDiscount = 0;
        int loyaltyDiscount = 0;
        String upgrades = "None";
        if (roomCategory.equals("Standard")) {
            baseRate = 150;
        } else if (roomCategory.equals("Deluxe")) {
            baseRate = 300;
        } else if (roomCategory.equals("Suite")) {
            baseRate = 500;
        } else if (roomCategory.equals("Presidential")) {
            baseRate = 1000;
        }
        if (season.equals("Off-Peak")) {
            seasonalMultiplier = 0.7;
        } else if (season.equals("Regular")) {
            seasonalMultiplier = 1.0;
        } else if (season.equals("Peak")) {
            seasonalMultiplier = 1.5;
        } else if (season.equals("Holiday")) {
            seasonalMultiplier = 2.0;
        }
        if (nightsBooked <= 4) {
            extendedDiscount = 0;
        } else if (nightsBooked >=5 && nightsBooked < 7) {
            extendedDiscount = 5;
        } else if (nightsBooked >=7 && nightsBooked < 14) {
            extendedDiscount = 10;
        } else {
            extendedDiscount = 20;
        }
        if (loyaltyTier.equals("None")) {
            loyaltyDiscount = 0;
        } else if (loyaltyTier.equals("Member")) {
            loyaltyDiscount = 10;
        } else if (loyaltyTier.equals("Gold")) {
            loyaltyDiscount = 15;
        } else if (loyaltyTier.equals("Platinum")) {
            loyaltyDiscount = 20;
        }
        double seasonalRate = baseRate * seasonalMultiplier;
        double afterExtended = seasonalRate - (seasonalRate * extendedDiscount / 100);
        double nightlyRate = afterExtended - (afterExtended * loyaltyDiscount / 100);
        double totalCost = nightlyRate * nightsBooked;
        if (loyaltyTier.equals("Gold")) {
            upgrades = "Free breakfast and spa access";
        }
        else if (loyaltyTier.equals("Platinum")) {
            upgrades = "Concierge service, airport transfer, and fine dining";
        }
        else if (loyaltyTier.equals("Member")) {
            upgrades = "Free breakfast";
        }
        System.out.println(" ");
        System.out.println("Room Category: " + roomCategory);
        System.out.println("Season: " + season);
        System.out.println("Nights Booked: " + nightsBooked);
        System.out.println("Loyalty Tier: " + loyaltyTier);
        System.out.println("Base Rate Per Night: $" + baseRate);
        System.out.println("Seasonal Multiplier: " + seasonalMultiplier + "x");
        System.out.println("Extended Stay Discount: " + extendedDiscount + "%");
        System.out.println("Loyalty Discount: " + loyaltyDiscount + "%");
        System.out.println("Nightly Rate: $" + nightlyRate);
        System.out.println("Total Booking Cost: $" + totalCost);
        System.out.println("Complimentary Upgrades: " + upgrades);

        sc.close();
    }
}
