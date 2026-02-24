import java.util.Scanner;

public class Agriculture_Farm {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int yieldPerAcre=sc.nextInt();
        int  acres=sc.nextInt();
        int extraYield=sc.nextInt();
        int damagedCrops=sc.nextInt();

        int total = (yieldPerAcre*acres) + extraYield-damagedCrops;

        System.out.println("Marketable Yield = "+total);
        sc.close();
    }
    
}
