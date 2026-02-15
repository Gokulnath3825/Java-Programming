import java.util.Scanner;

public class Book_Publishing {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int copies=sc.nextInt();
        int cost=sc.nextInt();
        int editing=sc.nextInt();
        int design=sc.nextInt();
        int commission=sc.nextInt();
        int marketing=sc.nextInt();

        int Profit =(copies*cost)+editing+design-commission-marketing;


        System.out.println("Publishing Profit = "+Profit);
        sc.close();
    }
    
}
