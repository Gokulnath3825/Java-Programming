import java.util.Scanner;

public class ElectricityBill22 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int unitsConsumed = sc.nextInt();
        sc.nextLine();
        String customerType = sc.nextLine();
        String season = sc.nextLine();
        String paymentMethod = sc.nextLine();

        double tier1Rate = 0, tier2Rate = 0, tier3Rate = 0, tier4Rate = 0;
        double tier1Cost = 0, tier2Cost = 0, tier3Cost = 0, tier4Cost = 0;
        double seasonalAdjustment = 0;
        double paymentDiscount = 0;

        if (customerType.equals("Residential")) {
            tier1Rate = 0.10;
            tier2Rate = 0.15;
            tier3Rate = 0.25;
            tier4Rate = 0.30;
        } else if (customerType.equals("Commercial")) {
            tier1Rate = 0.12;
            tier2Rate = 0.18;
            tier3Rate = 0.25;
            tier4Rate = 0.25;
        } else {
            tier1Rate = 0.08;
            tier2Rate = 0.12;
            tier3Rate = 0.20;
            tier4Rate = 0.20;
        }

        int remainingUnits = unitsConsumed;

        if (remainingUnits > 100) {
            tier1Cost = 100 * tier1Rate;
            remainingUnits -= 100;
        } else {
            tier1Cost = remainingUnits * tier1Rate;
            remainingUnits = 0;
        }

        if (remainingUnits > 200) {
            tier2Cost = 200 * tier2Rate;
            remainingUnits -= 200;
        } else {
            tier2Cost = remainingUnits * tier2Rate;
            remainingUnits = 0;
        }

        if (remainingUnits > 200) {
            tier3Cost = 200 * tier3Rate;
            remainingUnits -= 200;
        } else {
            tier3Cost = remainingUnits * tier3Rate;
            remainingUnits = 0;
        }

        tier4Cost = remainingUnits * tier4Rate;

        if (season.equals("Summer")) {
            seasonalAdjustment = 15;
        } else if (season.equals("Winter")) {
            seasonalAdjustment = -10;
        } else {
            seasonalAdjustment = 0;
        }

        if (paymentMethod.equals("Auto-Pay")) {
            paymentDiscount = 5;
        } else if (paymentMethod.equals("Online")) {
            paymentDiscount = 3;
        } else {
            paymentDiscount = 0;
        }

        double subtotal = tier1Cost + tier2Cost + tier3Cost + tier4Cost;

        double adjustedTotal = subtotal + (subtotal * seasonalAdjustment / 100);
        double totalBill = adjustedTotal - (adjustedTotal * paymentDiscount / 100);

        double averageRate = 0;
        if (unitsConsumed > 0) {
            averageRate = totalBill / unitsConsumed;
        }
        System.out.println();
        System.out.println("Units Consumed: " + unitsConsumed + " kWh");
        System.out.println("Customer Type: " + customerType);
        System.out.println("Season: " + season);
        System.out.println("Payment Method: " + paymentMethod);
        System.out.println("Tier 1 Cost (0-100): $" + tier1Cost);
        System.out.println("Tier 2 Cost (101-300): $" +tier2Cost);
        System.out.println("Tier 3 Cost (301-500): $" + tier3Cost);
        System.out.println("Tier 4 Cost (501+): $" +tier4Cost);
        System.out.println("Seasonal Adjustment: " + (int) seasonalAdjustment + "%");
        System.out.println("Payment Discount: " + (int) paymentDiscount + "%");
        System.out.println("Total Bill: $" +totalBill);
        System.out.println("Average Rate: $" +String.format("%.2f",averageRate) + "/kWh");

        sc.close();
    }
}