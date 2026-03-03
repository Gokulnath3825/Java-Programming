
import java.util.Scanner;

public class Problem02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean loop= true;
        int sum = 0;
        int count=0;
        while (loop) {
            int s1 = sc.nextInt();
            System.out.println("Enter number (0 to stop):"+s1);
            if(s1!=0){
                sum+=s1;
                count++;
            }else{
                loop = false;
            }
        }
        System.out.println("Total sum:"+sum);
        System.out.println("Count:"+count);
    }
}
