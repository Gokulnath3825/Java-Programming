
import java.util.Scanner;

public class Problem18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int days = sc.nextInt();
        int periods = sc.nextInt();
        String day = "";
        for(int i=0;i<days;i++){
            if(i==0)
                day="Monday";
            else if(i==1)
                day="Tuesday";
            else if(i==2)
                day="Wednesday";
            else if(i==3)
                day="Thursday";
            else if(i==4)
                day="Friday";
            else if(i==5)
                day="Friday";
            if(i==0){
                System.out.println("\nClass Time Table:");
                System.out.print("Day ");
                for(int k=1;k<=periods;k++){
                    System.out.print("Period"+k+" ");
                }
                System.out.println();
            }
            System.out.print(day+" ");
            for(int k=0;k<periods;k++){
                String hour = sc.next();
                System.out.print(hour+" ");
            }
            System.out.println();
        }
        sc.close();
        sc.close();
    }
}
