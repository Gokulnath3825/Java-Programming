
import java.util.Scanner;

public class Problem14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int original = n;
        int sum=0;
        int count=0;
        int temp=n;
        while(temp>0){
            temp/=10;
            count++;
        }
        while(n!=0){
            int digit = n%10;

            sum+=Math.pow(digit,count);
            
            // int power = 1;
            // for(int i=0;i<count;i++){
            //     power*=digit;
            // }
            // sum+=power;

            n=n/10;
        }
        if(sum==original){
            System.out.println(original+" is an Armstrong number");
        }else{
            System.out.println(original+" is not an Armstrong number");
        }

    }
}
