
import java.util.Scanner;

public class healthCare03 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int age = sc.nextInt();
        String status = sc.next();
        String pre_ex = sc.next();
        String Coverage = sc.next();

        double basePremium = 0.0;
        double riskSurcharge = 0.0;

        if (age >= 18 && age <= 30){
            if(Coverage.equals("Basic")){
                basePremium=200;
            }
            else if(Coverage.equals("Standard")){
                basePremium=300;
            }
            else if(Coverage.equals("Premium")){
                basePremium=500;
            }
        }
        else if(age >= 31 && age <= 50){
            if(Coverage.equals("Basic")){
                basePremium=250;
            }
            else if(Coverage.equals("Standard")){
                basePremium=300;
            }
            else if(Coverage.equals("Premium")){
                basePremium=500;
            }
        }
        else if(age >= 51 && age <= 65){
            if(Coverage.equals("Basic")){
                basePremium=350;
            }
            else if(Coverage.equals("Standard")){
                basePremium=450;
            }
            else if(Coverage.equals("Premium")){
                basePremium=700;
            }
        }
        else if(age >= 66){
            if(Coverage.equals("Basic")){
                basePremium=400;
            }
            else if(Coverage.equals("Standard")){
                basePremium=550;
            }
            else if(Coverage.equals("Premium")){
                basePremium=600;
            }
        }

        if(status.equals("Smoker")){
            if(pre_ex.equals("Yes")){
                riskSurcharge=(0.70*basePremium);
            }
            else{
                riskSurcharge=(40*basePremium)/100.0;
            }
        }
        else if(status.equals("Non-Smoker")){
            if(pre_ex.equals("Yes")){
                riskSurcharge=0.30*basePremium;
            }
            
        }

        double totalPremium = basePremium + riskSurcharge;

        System.out.println("Age: " + age);
        System.out.println("Smoking Status: " + status);
        System.out.println("Pre-existing Conditions: " + pre_ex);
        System.out.println("Coverage Tier: " + Coverage);
        System.out.println("Base Premium: $" + basePremium);
        System.out.println("Risk Surcharge: $" + riskSurcharge);
        System.out.println("Total Monthly Premium: $" + totalPremium);


    }

    
}
