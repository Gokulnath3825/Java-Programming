
import java.util.*;

public class onlineExam{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int theory = sc.nextInt();
        int practical = sc.nextInt();
        
        int avg= (theory+practical)/2;
        if(theory >= 50 && practical >= 50){
            if(avg>=60){
                System.out.println("PASS");
            }
            else{
                System.out.println("FAIL");
            }
            
        }
        else{
            System.out.println("FAIL");
        }

    }
}