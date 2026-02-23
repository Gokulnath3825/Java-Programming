import java.util.Scanner;

public class ParkingFee21 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String locationZone = sc.next();
        double parkingHours = sc.nextDouble();
        sc.nextLine();
        String vehicleType = sc.next();
        String membershipStatus = sc.next();

        double baseRate = 5.0;
        double zonePremium = 0.0;
        double vehicleSurcharge = 0.0;
        double membershipDiscount = 0.0;
        double dailyCap = Double.MAX_VALUE;
        boolean dailyCapApplied = false;
        String rateCategory = "";

        if (locationZone.equals("Downtown")) {
            zonePremium = 50.0;
            dailyCap = 150.0;
            rateCategory = "Premium";
        } 
        else if (locationZone.equals("Business-District")) {
            zonePremium = 30.0;
            dailyCap = 120.0;
            rateCategory = "Premium";
        } 
        else if (locationZone.equals("Residential")) {
            zonePremium = 0.0;
            dailyCap = 60.0;
            rateCategory = "Standard";
        } 
        else if (locationZone.equals("Airport")) {
            zonePremium = 100.0;
            dailyCap = 180.0;
            rateCategory = "Luxury";
        }
        if (vehicleType.equals("Motorcycle")) {
            vehicleSurcharge = -2.0;
        } 
        else if (vehicleType.equals("Compact")) {
            vehicleSurcharge = 0.0;
        } 
        else if (vehicleType.equals("Sedan")) {
            vehicleSurcharge = 0.0;
        } 
        else if (vehicleType.equals("SUV")) {
            vehicleSurcharge = 3.0;
        } 
        else if (vehicleType.equals("Oversized")) {
            vehicleSurcharge = 5.0;
        }

        if (membershipStatus.equals("None")) {
            membershipDiscount = 0.0;
        } 
        else if (membershipStatus.equals("Monthly")) {
            membershipDiscount = 20.0;
        } 
        else if (membershipStatus.equals("Annual")) {
            membershipDiscount = 25.0;
        } 
        else if (membershipStatus.equals("VIP")) {
            membershipDiscount = 30.0;
        }

        double hourlyRate = (baseRate * (1 + zonePremium / 100)) + vehicleSurcharge;
        double calculatedFee = hourlyRate * parkingHours;

        double discountedFee = calculatedFee * (1 - membershipDiscount / 100);

        double finalFee = discountedFee;
        if (parkingHours >= 24.0) {
            if (discountedFee > dailyCap) {
                finalFee = dailyCap;
                dailyCapApplied = true;
            }
        }

        System.out.println("Location Zone: " + locationZone);
        System.out.println("Parking Duration: " + parkingHours + " hours");
        System.out.println("Vehicle Type: " + vehicleType);
        System.out.println("Membership Status: " + membershipStatus);
        System.out.println("Base Hourly Rate: $" + baseRate);
        System.out.println("Zone Premium: " + (int)zonePremium + "%");
        System.out.println("Vehicle Size Surcharge: $" + vehicleSurcharge);
        System.out.println("Membership Discount: " + (int)membershipDiscount + "%");
        System.out.println("Total Parking Fee: $" + finalFee);
        System.out.println("Daily Cap Applied: " + (dailyCapApplied ? "Yes" : "No"));
        System.out.println("Rate Category: " + rateCategory);

        sc.close();
    }
}