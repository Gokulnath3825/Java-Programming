import java.util.Scanner;
public class universityScholarship05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double gpa = sc.nextDouble();
        double income = sc.nextDouble();
        int extra = sc.nextInt();
        String type = sc.next();
        double amount =0.0;
        if(gpa>=2.5){
            if(type.equals("Merit")){
                if(gpa>=3.8 && extra>=80){
                    amount=25000;
                }
                else if(gpa>=3.5 && extra>=70){
                    amount=15000;
                }
                else if(gpa>=3.0 && extra>=60){
                    amount=8000;
                }
            }
            else if(type.equals("Need-Based")){
                if(gpa>=3.5 && income<=30000){
                    amount=30000;
                }
                else if(gpa>=3.0 && income<=50000){
                    amount=18000;
                }
                else if(gpa>=2.8 && income<=70000){
                    amount=10000;
                }
            }
            else if(type.equals("Sports")){
                if(gpa>=3.0 && extra>=85){
                    amount=22000;
                }
                else if(gpa>=2.8 && extra>=75){
                    amount=20000;
                }
                else if(gpa>=2.5 && extra>=65){
                    amount=12000;
                }
            }
        }

        System.out.println(" ");
        System.out.println("GPA:"+gpa);
        System.out.println("Family Income: $"+income);
        System.out.println("Extracurricular Score:"+extra);
        System.out.println("Scholarship Type:"+type);
        if(amount!=0){
            System.out.println("Eligibility:Eligible");
        }else{
            System.out.println("Eligibility:Not Eligible");
        }
        System.out.println("Award Amount: $"+amount);
        if(amount>20000){
            System.out.println("Award Category: Full");
        }
        else if(amount>=15000){
            System.out.println("Award Category: Partial");
        }
        else if(amount>=5000){
            System.out.println("Award Category: Minimal");
        }
        else{
            System.out.println("Award Category: None");
        }
    }
}