
import java.util.Scanner;

public class Problem15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int products = sc.nextInt();
        double sum=0;
        for(int i=0;i<products;i++){
            if(i==0){
                System.out.println("\nStar Rating Matrix:");
                System.out.println("Product Rating Stars");
            }
            String name = sc.next();
            double rate = sc.nextDouble();
            sum+=rate;
            System.out.print(name+" "+rate+" ");
            if(rate>=1 && rate<2){
                System.out.print("★☆☆☆☆");
            }
            else if(rate>=2 && rate<3){
                System.out.print("★★☆☆☆");
            }
            else if(rate>=3 && rate<4){
                System.out.print("★★★☆☆");
            }
            else if(rate>=4 && rate<5){
                System.out.print("★★★★☆");
            }
            else if(rate>=5){
                System.out.print("★★★★★ ");
            }
            System.out.println();
        }
        double avg = sum/products;
        System.out.println("\nAverage Rating: "+avg);
        sc.close();
        sc.close();
    }
}