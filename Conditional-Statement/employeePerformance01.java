
import java.util.Scanner;

public class employeePerformance01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int performance = sc.nextInt();
        int year = sc.nextInt();
        String dept =sc.next();
        int salary=sc.nextInt();
        double amount=0;
        if(dept.charAt(0)=='C'){
            if(performance==5 && year>=5){
                amount=(salary*25)/100.0;
                System.out.println("Performance Rating: "+performance);
                System.out.println("Years of Service: "+year);
                System.out.println("Department:Critical");
                System.out.println("Bonus Percentage: 25%");
                System.out.println("Bonus Amount: $"+amount);
                System.out.println("Status: Eligible");
            }
            else if(performance==4 && year>=10){
                amount=(salary*22)/100.0;
                System.out.println("Performance Rating: "+performance);
                System.out.println("Years of Service: "+year);
                System.out.println("Department:Critical");
                System.out.println("Bonus Percentage: 22%");
                System.out.println("Bonus Amount: $"+amount);
                System.out.println("Status: Eligible");
            }
            else if(performance==4){
                amount=(salary*15)/100.0;
                System.out.println("Performance Rating: "+performance);
                System.out.println("Years of Service: "+year);
                System.out.println("Department:Critical");
                System.out.println("Bonus Percentage: 15%");
                System.out.println("Bonus Amount: $"+amount);
                System.out.println("Status: Eligible");
            }
            else if(performance==3){
                amount=(salary*10)/100.00;
                System.out.println("Performance Rating: "+performance);
                System.out.println("Years of Service: "+year);
                System.out.println("Department:Critical");
                System.out.println("Bonus Percentage: 10%");
                System.out.println("Bonus Amount: $"+amount);
                System.out.println("Status: Eligible");
            }else{
                System.out.println("Performance Rating: "+performance);
                System.out.println("Years of Service: "+year);
                System.out.println("Department:Critical");
                System.out.println("Bonus Percentage:0%");
                System.out.println("Bonus Amount: $"+amount);
                System.out.println("Status:Not Eligible");
            }
            
        }
        else if(dept.charAt(0)=='N'){
            if(performance==5){
                amount=(salary*18)/100.0;
                System.out.println("Performance Rating: "+performance);
                System.out.println("Years of Service: "+year);
                System.out.println("Department:Non-Critical");
                System.out.println("Bonus Percentage: 18%");
                System.out.println("Bonus Amount: $"+amount);
                System.out.println("Status:Eligible");
            }
            else if(performance==4){
                amount=(salary*12)/100.0;
                System.out.println("Performance Rating: "+performance);
                System.out.println("Years of Service: "+year);
                System.out.println("Department:Non-Critical");
                System.out.println("Bonus Percentage: 12%");
                System.out.println("Bonus Amount: $"+amount);
                System.out.println("Status:Eligible");
            }
            else if(performance==3){
                amount=(salary*8)/100.00;
                System.out.println("Performance Rating: "+performance);
                System.out.println("Years of Service: "+year);
                System.out.println("Department:Non-Critical");
                System.out.println("Bonus Percentage: 8%");
                System.out.println("Bonus Amount: $"+amount);
                System.out.println("Status:Eligible");
            }else{
                System.out.println("Performance Rating: "+performance);
                System.out.println("Years of Service: "+year);
                System.out.println("Department:Non-Critical");
                System.out.println("Bonus Percentage:0%");
                System.out.println("Bonus Amount: $"+amount);
                System.out.println("Status:Not Eligible");
            }
        }
    }
    
}