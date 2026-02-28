import java.util.Scanner;
public class Problem07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double Total = 0;
        int totalUnits = 0;
        for(int i = 0; i < n; i++) {
            String consumerID = sc.next();
            int unitsConsumed = sc.nextInt();
            totalUnits += unitsConsumed;

            double price = 0.0;
            String Category = "";

            if(unitsConsumed >= 0 && unitsConsumed <= 100){
                price = unitsConsumed * 0.10;
                Category = "Low Usage";
            }
            else if(unitsConsumed > 100 && unitsConsumed <= 200){
                price = 100 * 0.10 + (unitsConsumed - 100) * 0.13;
                Category = "Medium Usage";
            }
            else if(unitsConsumed > 200 && unitsConsumed <= 300){
                price = 100 * 0.10 + 100 * 0.13 + (unitsConsumed - 200) * 0.16;
                Category = "Medium Usage";
            }
            else if(unitsConsumed > 300){
                price = 100 * 0.10 + 100 * 0.13 + 100 * 0.16 + (unitsConsumed - 300) * 0.20;
                Category = "High Usage";
            }
            Total += price;
            System.out.println();
            System.out.println("Consumer ID: " + consumerID);
            System.out.println("Units Consumed: " + unitsConsumed);
            System.out.println("Bill Amount: $" + price);
            System.out.println("Category: " + Category);
        }
        sc.close();

        double avg = Total / n;

        System.out.println();
        System.out.println("Total Consumers: " + n);
        System.out.println("Total Units Consumed: " + totalUnits);
        System.out.println("Total Revenue: $" + Total);
        System.out.println("Average Bill: $" + String.format("%.1f", avg));

        sc.close();
    }
}