import java.util.Scanner;
public class restaurantOrder11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String orderType = sc.next();
        String loyalty = sc.next();
        double orderValue = sc.nextDouble();
        String slot = sc.next();

        double Discount=0.0;
        double addDiscount=0.0;
        double Service=0.0;
        String kitchenPriority="";
        int time=0;
        if(loyalty.equals("Gold")){
            Discount=15;
        }
        else if(loyalty.equals("Silver")){
            Discount=10;
        }
        else if(loyalty.equals("Bronze")){
            Discount=5;
        }
        else{
            Discount=0;
        }

        if(slot.equals("Late-Night"))
            addDiscount=-5;
        else
            addDiscount=0;
        
        if(orderType.equals("Delivery")){
            Service=orderValue*0.10;
        }
        else if(orderType.equals("Takeout")){
            Service=orderValue*0.03;
        }
        double totaldis=addDiscount+Discount;
        double disValue = orderValue*(1-totaldis/100);
        double finalAmount = disValue+Service;
        
        if(slot.equals("Peak") && orderType.equals(" Delivery"))
            kitchenPriority="High";
        else if(slot.equals("Regular"))
            kitchenPriority="Medium";
        else if(slot.equals("Late-Night"))
            kitchenPriority="Low";
        else
            kitchenPriority="Medium";

        if (kitchenPriority.equals("High")){

            time = 35;
        }
        else if (kitchenPriority.equals("Medium")){

            time = 25;
        }
        else{
            time = 15;
        }
        System.out.println(" ");
        System.out.println("Order Type:"+orderType);
        System.out.println("Loyalty Status:"+loyalty);
        System.out.println("Order Value: $"+orderValue);
        System.out.println("Time Slot:"+slot);
        System.out.println("Base Discount:"+(int)Discount+"%");
        System.out.println("Time-Based Adjustment:"+(int)addDiscount+"%");
        System.out.println("Service Fee: $"+(float)Service);
        System.out.println("Final Amount: $"+finalAmount);
        System.out.println("Kitchen Priority:"+kitchenPriority);
        System.out.println("Estimated Prep Time:"+time+"minutes");

    }
    
}
