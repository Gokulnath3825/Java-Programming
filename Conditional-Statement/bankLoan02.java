
import java.util.Scanner;

public class bankLoan02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int score=sc.nextInt();
        double income=sc.nextDouble();
        double ratio=sc.nextDouble();
        String type=sc.next();
        double loan=0.0;
        if(type.charAt(0)=='H'){
            if(score>=750 && ratio<=30){
                loan=4*income;
                System.out.println("Credit Score: "+score);
                System.out.println("Annual Income: $"+income);
                System.out.println("Debt-to-Income Ratio: "+ratio+"%");
                System.out.println("Loan Type: Home");
                System.out.println("Decision: Approved");
                System.out.println("Maximum Loan Amount: $"+loan);
            }
            else if(((score>=700 && score<750) || (score>=650 && score<700)) && (ratio>=31 && ratio<=40)){
                loan=3*income;
                System.out.println("Credit Score: "+score);
                System.out.println("Annual Income: $"+income);
                System.out.println("Debt-to-Income Ratio: "+ratio+"%");
                System.out.println("Loan Type: Home");
                System.out.println("Decision: Needs Review");
                System.out.println("Maximum Loan Amount: $"+loan);
            }
            else{
                System.out.println("Credit Score: "+score);
                System.out.println("Annual Income: $"+income);
                System.out.println("Debt-to-Income Ratio: "+ratio+"%");
                System.out.println("Loan Type: Home");
                System.out.println("Decision: Rejected");
                System.out.println("Maximum Loan Amount: $"+loan);
            }
        }
        else if(type.charAt(0)=='P'){
            if(score>=750 && ratio<=30){
                loan=1*income;
                System.out.println("Credit Score: "+score);
                System.out.println("Annual Income: $"+income);
                System.out.println("Debt-to-Income Ratio: "+ratio+"%");
                System.out.println("Loan Type: Personal");
                System.out.println("Decision: Approved");
                System.out.println("Maximum Loan Amount: $"+loan);
            }
            else if((score>=650 && score<700) && (ratio>=31 && ratio<=40)){
                loan=0.5*income;
                System.out.println("Credit Score: "+score);
                System.out.println("Annual Income: $"+income);
                System.out.println("Debt-to-Income Ratio: "+ratio+"%");
                System.out.println("Loan Type: Personal");
                System.out.println("Decision: Needs Review");
                System.out.println("Maximum Loan Amount: $"+loan);
            }
            else{
                System.out.println("Credit Score: "+score);
                System.out.println("Annual Income: $"+income);
                System.out.println("Debt-to-Income Ratio: "+ratio+"%");
                System.out.println("Loan Type: Personal");
                System.out.println("Decision: Rejected");
                System.out.println("Maximum Loan Amount: $"+loan);
            }
        }
        else if(type.charAt(0)=='B'){
            if((score>=750 || (score>=700 && score<750)) && (ratio<=30 || (ratio>=31 && ratio<=40))){
                loan=3*income;
                System.out.println("Credit Score: "+score);
                System.out.println("Annual Income: $"+income);
                System.out.println("Debt-to-Income Ratio: "+ratio+"%");
                System.out.println("Loan Type: Business");
                System.out.println("Decision: Approved");
                System.out.println("Maximum Loan Amount: $"+loan);
            }
            else{
                System.out.println("Credit Score: "+score);
                System.out.println("Annual Income: $"+income);
                System.out.println("Debt-to-Income Ratio: "+ratio+"%");
                System.out.println("Loan Type: Business");
                System.out.println("Decision: Rejected");
                System.out.println("Maximum Loan Amount: $"+loan);
            }
        }
        else{
            System.out.println("give the proper loan Type");
        }

        
    }
    
}
