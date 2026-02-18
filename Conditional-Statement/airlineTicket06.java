
import java.util.Scanner;

public class airlineTicket06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String book = sc.next();
        int days = sc.nextInt();
        double seat = sc.nextDouble();
        String route = sc.next();

        double BasePrice = 0.0;
        double demand=0.0;
        String category="Low";

        if(book.equals("Economy")){
            if(route.equals("Domestic")){
                BasePrice=200;
            }
            else if(route.equals("International-Short")){
                BasePrice=500;
            }
            else if(route.equals("International-Long")){
                BasePrice=800;
            }
        }
        else if(book.equals("Business")){
            if(route.equals("Domestic")){
                BasePrice=600;
            }
            else if(route.equals("International-Short")){
                BasePrice=1500;
            }
            else if(route.equals("International-Long")){
                BasePrice=2500;
            }
        }
        else if(book.equals("First")){
            if(route.equals("Domestic")){
                BasePrice=1000;
            }
            else if(route.equals("International-Short")){
                BasePrice=3000;
            }
            else if(route.equals("International-Long")){
                BasePrice=5000;
            }
        }
        if(seat<30 && days<14){
            demand=1.8;
            category="High Demand";
        }
        else if(seat<50 && days<30){
            demand=1.5;
            category="High Demand";
        }
        else if(seat<60 || days>50 && days<=60){
            demand=1.0;
            category="Moderate";
        }
        else if(seat>=60 && days>60){
            demand=0.8;
            category="Low Demand";
        }
        double finalPrice=BasePrice*demand;
        System.out.println(" ");
        System.out.println("Booking Class:"+book);
        System.out.println("Days Until Departure:"+days);
        System.out.println("Seat Availability:"+seat+"%");
        System.out.println("Route Type:"+route);
        System.out.println("Base Price:$"+BasePrice);
        System.out.println("Demand Multiplier:"+demand+"x");
        System.out.println("Final Ticket Price: $"+finalPrice);
        System.out.println("Pricing Category:"+category);

    




        



    }
}
