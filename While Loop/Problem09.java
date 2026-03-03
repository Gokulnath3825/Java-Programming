
import java.util.Scanner;

public class Problem09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean prime = true;
        int i=2;
        while(i<n){
            if(n%i==0){
                prime=false;
            }
            i++;
        }
        if(prime){
            System.out.println(n+" is Prime");
        }else{
            System.out.println(n+" is not Prime");

        }
    }
}
