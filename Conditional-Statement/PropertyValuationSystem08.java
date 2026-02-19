import java.util.Scanner;
public class PropertyValuationSystem08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String locationTier = sc.nextLine();
        int squareFootage = sc.nextInt();
        int propertyAge = sc.nextInt();
        int amenityScore = sc.nextInt();

        double basePricePerSqFt = 0.0;
        double ageAdjustment = 0.0;
        double amenityBonus = 0.0;
        String marketCategory = "Slow";
        if (locationTier.equalsIgnoreCase("Prime")) {
            basePricePerSqFt = 400.0;
        } else if (locationTier.equalsIgnoreCase("Urban")) {
            basePricePerSqFt = 300.0;
        } else if (locationTier.equalsIgnoreCase("Suburban")) {
            basePricePerSqFt = 180.0;
        } else {
            basePricePerSqFt = 100.0;
        }

        double baseValue = squareFootage * basePricePerSqFt;
        
        if (propertyAge <= 5) {
            ageAdjustment = 0;
        } else {
            if (propertyAge <= 15) {
                if (propertyAge <= 10) {
                    ageAdjustment = -5;
                } else {
                    ageAdjustment = -10;
                }
            } else if (propertyAge <= 30) {
                if (propertyAge <= 25) {
                    ageAdjustment = -15;
                } else {
                    ageAdjustment = -20;
                }
            } else {
                if (propertyAge <= 40) {
                    ageAdjustment = -25;
                } else {
                    ageAdjustment = -35;
                }
            }
        }

        double adjustedValue = baseValue * (1 + ageAdjustment / 100);

        if (amenityScore >= 80) {
            amenityBonus = (baseValue *10)/100.0;
        }
        else if (amenityScore >= 60) {
            amenityBonus = (baseValue *5)/100.0;
        }
        else if (amenityScore >= 40) {
            amenityBonus = (baseValue * 2)/100.0;
        }
        else {
            amenityBonus = 0;
        }
        double finalValue = adjustedValue + amenityBonus;
        if ((locationTier.equalsIgnoreCase("Prime") || locationTier.equalsIgnoreCase("Urban"))
                && propertyAge < 15) {
            marketCategory = "Hot";
        } else if (locationTier.equalsIgnoreCase("Suburban")) {
            marketCategory = "Stable";
        } else {
            marketCategory = "Slow";
        }

        System.out.println(" ");
        System.out.println("Location Tier: " + locationTier);
        System.out.println("Square Footage: " + squareFootage + " sq ft");
        System.out.println("Property Age: " + propertyAge + " years");
        System.out.println("Amenity Score: " + amenityScore);
        System.out.println("Base Price Per Sq Ft: $" + basePricePerSqFt);
        System.out.println("Age Adjustment: " + (int)ageAdjustment + "%");
        System.out.println("Amenity Bonus: $" + amenityBonus);
        System.out.println("Estimated Property Value: $" + finalValue);
        System.out.println("Market Category: " + marketCategory);

        sc.close();
    }
}
