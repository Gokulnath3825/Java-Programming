import java.util.Scanner;

public class ShippingCalculator18 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double packageWeight = sc.nextDouble();
        String destinationZone = sc.next();
        String shippingSpeed = sc.next();
        String packageSize = sc.next();

        double baseRate = 0.0;
        double weightSurcharge = packageWeight * 1.0;
        double zoneMultiplier = 1.0;
        double sizeSurcharge = 0.0;
        int deliveryDays = 0;
        String serviceLevel = "";
        if (shippingSpeed.equals("Economy")) {
            baseRate = 5.0;
            serviceLevel = "Budget";
        } else if (shippingSpeed.equals("Standard")) {
            baseRate = 10.0;
            serviceLevel = "Standard";
        } else if (shippingSpeed.equals("Express")) {
            baseRate = 25.0;
            serviceLevel = "Priority";
        } else if (shippingSpeed.equals("Overnight")) {
            baseRate = 50.0;
            serviceLevel = "Premium";
        }
        if (destinationZone.equals("Local")) {
            zoneMultiplier = 1.0;
        } else if (destinationZone.equals("Regional")) {
            zoneMultiplier = 1.2;
        } else if (destinationZone.equals("National")) {
            zoneMultiplier = 1.5;
        } else if (destinationZone.equals("International")) {
            zoneMultiplier = 3.0;
        }
        if (packageSize.equals("Small")) {
            sizeSurcharge = 0.0;
        } else if (packageSize.equals("Medium")) {
            sizeSurcharge = 5.0;
        } else if (packageSize.equals("Large")) {
            sizeSurcharge = 15.0;
        } else if (packageSize.equals("Oversized")) {
            sizeSurcharge = 30.0;
        }
        if (shippingSpeed.equals("Economy")) {
            if (destinationZone.equals("Local")) {
                deliveryDays = 5;
            } else if (destinationZone.equals("Regional")) {
                deliveryDays = 7;
            } else if (destinationZone.equals("National")) {
                deliveryDays = 10;
            } else {
                deliveryDays = 21;
            }
        } 
        else if (shippingSpeed.equals("Standard")) {
            if (destinationZone.equals("Local")) {
                deliveryDays = 3;
            } else if (destinationZone.equals("Regional")) {
                deliveryDays = 5;
            } else if (destinationZone.equals("National")) {
                deliveryDays = 7;
            } else {
                deliveryDays = 14;
            }
        } 
        else if (shippingSpeed.equals("Express")) {
            if (destinationZone.equals("Local")) {
                deliveryDays = 1;
            } else if (destinationZone.equals("Regional")) {
                deliveryDays = 2;
            } else if (destinationZone.equals("National")) {
                deliveryDays = 2;
            } else {
                deliveryDays = 5;
            }
        } 
        else if (shippingSpeed.equals("Overnight")) {
            deliveryDays = 1;
        }
        double baseCost = (baseRate + weightSurcharge) * zoneMultiplier;
        double totalCost = baseCost + sizeSurcharge;
        System.out.println(" ");
        System.out.println("Package Weight: " + packageWeight + " lbs");
        System.out.println("Destination Zone: " + destinationZone);
        System.out.println("Shipping Speed: " + shippingSpeed);
        System.out.println("Package Size: " + packageSize);
        System.out.println("Base Shipping Rate: $" + baseRate);
        System.out.println("Weight Surcharge: $" + weightSurcharge);
        System.out.println("Zone Multiplier: " + zoneMultiplier + "x");
        System.out.println("Size Surcharge: $" + sizeSurcharge);
        System.out.println("Total Shipping Cost: $" + totalCost);
        System.out.println("Estimated Delivery: " + deliveryDays + " business days");
        System.out.println("Service Level: " + serviceLevel);

        sc.close();
    }
}