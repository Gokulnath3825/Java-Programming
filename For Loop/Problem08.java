import java.util.Scanner;

public class Problem08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        double originalTotal = 0;
        double finalTotal = 0;
        int items = 0;

        for(int i = 0; i < n; i++) {
            String productName = sc.next();
            double price = sc.nextDouble();
            int quantity = sc.nextInt();

            int dis = 0;
            items += quantity;

            if(quantity > 1 && quantity < 5){
                dis = 10;
            }
            else if(quantity >= 5 && quantity < 10){
                dis = 15;
            }
            else if(quantity >= 10){
                dis = 20;
            }

            double subTotal = (price * quantity) * (1 - dis / 100.0);

            originalTotal += price * quantity;
            finalTotal += subTotal;

            System.out.println();
            System.out.println("Product: " + productName);
            System.out.println("Unit Price: $" + price);
            System.out.println("Quantity: " + quantity);
            System.out.println("Discount: " + dis + "%");
            System.out.println("Subtotal: $" + String.format("%.2f", subTotal));
        }
        sc.close();

        double totalDiscount = originalTotal - finalTotal;

        double avg = 0;
        if(originalTotal != 0) {
            avg = (totalDiscount / originalTotal) * 100;
        }

        System.out.println();
        System.out.println("Total Items: " + items);
        System.out.println("Original Total: $" + String.format("%.2f", originalTotal));
        System.out.println("Total Discount: $" + String.format("%.2f", totalDiscount));
        System.out.println("Final Total: $" + String.format("%.2f", finalTotal));
        System.out.println("Savings: " + String.format("%.2f", avg) + "%");

        sc.close();
    }
}