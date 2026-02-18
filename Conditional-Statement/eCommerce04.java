
import java.util.Scanner;

public class eCommerce04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String loyalty=sc.next();
        double cartValue=sc.nextDouble();
        String product=sc.next();
        String member=sc.next();

        int baseDiscount = 0;
        int addDiscount  = 0;
        int speciBonus   = 0;

        if(loyalty.equals("Bronze")){
            baseDiscount=5;
        }
        else if(loyalty.equals("Silver")){
            baseDiscount=8;
        }
        else if(loyalty.equals("Gold")){
            baseDiscount=12;
        }
        else if(loyalty.equals("Platinum")){
            baseDiscount=15;
        }

        if(cartValue>=500 && cartValue<=999){
            addDiscount=3;
        }
        else if(cartValue>=1000 && cartValue<=1999){
            addDiscount=5;
        }
        else if(cartValue>=2000){
            addDiscount=7;
        }

        if(product.equals("Electronics")){
            if(member.equals("Prime")){
                speciBonus=5;
            }
        }
        else if(product.equals("Fashion")){
            speciBonus=3;
        }
        else if(product.equals("Books")){
            if(member.equals("Prime")){
                speciBonus=5;
            }
        }
        else if(product.equals("Groceries")){
            if(cartValue>=300){
                speciBonus=2;
            }
        }

        int TotalDis = baseDiscount+addDiscount+speciBonus;
        double finalPrice = cartValue*(1-TotalDis/100.0);
        double savings = cartValue-finalPrice;
        System.out.println(" ");
        System.out.println("Loyalty Tier:"+loyalty);
        System.out.println("Cart Value: $"+cartValue);
        System.out.println("Product Category:"+product);
        System.out.println("Membership:"+member);
        System.out.println("Base Discount:"+baseDiscount+"%");
        System.out.println("Additional Discount:"+(speciBonus+addDiscount)+"%");
        System.out.println("Total Discount:"+TotalDis+"%");
        System.out.println("Final Price: $"+finalPrice);
        System.out.println("Savings: $"+savings);





        

        

    }
}