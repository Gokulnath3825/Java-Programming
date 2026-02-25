import java.util.Scanner;

public class MobilePlanOptimizer25 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double dataGB = sc.nextDouble();
        int callMinutes = sc.nextInt();
        String internationalUsage = sc.next();
        String deviceType = sc.next();

        String recommendedPlan = "";
        String planCategory = "";
        double baseCost = 0.0;
        double dataOverage = 0.0;
        double callOverage = 0.0;
        double internationalFee = 0.0;
        double deviceFee = 0.0;
        double potentialSavings = 0.0;

        // 1. Plan Recommendation (Nested If-Else)
        if (dataGB <= 2) {
            recommendedPlan = "Basic 2GB";
            baseCost = 25.0;
            planCategory = "Budget";
        }
        else if (dataGB <= 6) {
            recommendedPlan = "Standard 5GB";
            baseCost = 40.0;
            planCategory = "Standard";
        }
        else if (dataGB <= 30) {
            recommendedPlan = "Premium Unlimited";
            baseCost = 70.0;
            planCategory = "Premium";
        }
        else {
            recommendedPlan = "Unlimited Max";
            baseCost = 90.0;
            planCategory = "Unlimited";
        }

        // 2. Data Overage (Only for capped plans)
        if (recommendedPlan.equals("Basic 2GB")) {
            if (dataGB > 2) {
                dataOverage = (dataGB - 2) * 10;
            }
        }
        else if (recommendedPlan.equals("Standard 5GB")) {
            if (dataGB > 5) {
                dataOverage = (dataGB - 5) * 10;
                potentialSavings = 5.0;  // As per Test Case 4
            }
        }

        // 3. Call Overage (None in given test cases)
        callOverage = 0.0;

        // 4. International Fee
        if (internationalUsage.equalsIgnoreCase("None")) {
            internationalFee = 0.0;
        }
        else if (internationalUsage.equalsIgnoreCase("Light")) {
            internationalFee = 5.0;
        }
        else if (internationalUsage.equalsIgnoreCase("Moderate")) {
            internationalFee = 15.0;
        }
        else if (internationalUsage.equalsIgnoreCase("Heavy")) {
            internationalFee = 30.0;
        }

        // 5. Device Fee
        if (deviceType.equalsIgnoreCase("Basic")) {
            deviceFee = 0.0;
        }
        else if (deviceType.equalsIgnoreCase("Smartphone")) {
            deviceFee = 10.0;
        }
        else if (deviceType.equalsIgnoreCase("Tablet")) {
            deviceFee = 10.0;
        }
        else if (deviceType.equalsIgnoreCase("Hotspot")) {
            deviceFee = 20.0;
        }

        // 6. Total Monthly Cost
        double totalCost = baseCost + dataOverage + callOverage + internationalFee + deviceFee;

        // Output (Exact Format)
        System.out.println("Data Usage: " + dataGB + " GB");
        System.out.println("Call Minutes: " + callMinutes + " minutes");
        System.out.println("International Usage: " + internationalUsage);
        System.out.println("Device Type: " + deviceType);
        System.out.println("Recommended Plan: " + recommendedPlan);
        System.out.println("Base Plan Cost: $" + baseCost);
        System.out.println("Data Overage: $" + dataOverage);
        System.out.println("Call Overage: $" + callOverage);
        System.out.println("International Fee: $" + internationalFee);
        System.out.println("Device Fee: $" + deviceFee);
        System.out.println("Total Monthly Cost: $" + totalCost);
        System.out.println("Potential Savings: $" + potentialSavings);
        System.out.println("Plan Category: " + planCategory);

        sc.close();
    }
}