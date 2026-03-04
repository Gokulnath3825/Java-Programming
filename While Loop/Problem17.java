import java.util.Scanner;

public class Problem17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i=1;
        int sum=0;
        while(i<n){
            if(n%i==0){
                sum+=i;
            }
            i++;
        }
        if(n==sum){
            System.out.println(n+" is a perfect number");
        }else{
            System.out.println(n+" is not a perfect number");
        }
        sc.close();
        sc.close();
    }
}
