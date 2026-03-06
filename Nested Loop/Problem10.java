
import java.util.Scanner;

public class Problem10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int products = sc.nextInt();
        int vendors = sc.nextInt();

        for(int i=0;i<products;i++){
            if(i==0){
                System.out.println("\nPrice Comparison Matrix:");
                System.out.print("Product ");
                for(int j=1;j<=vendors;j++){
                    System.out.print("Vendor"+j+" ");
                }
                System.out.println("BestPrice");
            }
            String name = sc.next();
            System.out.print(name+" ");
            double best = Double.MAX_VALUE;
            for(int k=0;k<vendors;k++){
                double price = sc.nextDouble();
                System.out.print(price+" ");
                best = Math.min(price,best);
            }
            System.out.printf("%.2f",best);
            System.out.println();
        }
    }
}
