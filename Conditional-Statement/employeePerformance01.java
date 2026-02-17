
import java.util.Scanner;

public class employeePerformance01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int performance = sc.nextInt();
        int year = sc.nextInt();
        String dept =sc.next();
        double salary=sc.nextDouble();
        double amount=0.0;
        int percentage=0;

        if(dept.charAt(0)=='C'){
            if(performance==5 && year>=5){
                percentage=25;
            }
            else if(performance==4 && year>=10){
                percentage=22;
            }
            else if(performance==4){
                percentage=15;
            }
            else if(performance==3){
                percentage=10;
            }
            
        }
        else if(dept.charAt(0)=='N'){
            if(performance==5){
                percentage=18;
            }
            else if(performance==4){
                percentage=12;
            }
            else if(performance==3){
                percentage=8;
            }
        }
        amount=(percentage*salary)/100.0;

        System.out.println("Performance Rating: "+performance);
        System.out.println("Years of Service: "+year);
        System.out.println("Department:"+dept);
        System.out.println("Bonus Percentage:"+percentage+"%");
        System.out.println("Bonus Amount: $"+amount);
        if(performance>=3){
            System.out.println("Status:Eligible");
        }else{
            System.out.println("Status:Not Eligible");
        }
        sc.close();
    }
    
}
