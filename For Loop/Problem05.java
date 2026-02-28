
import java.util.Scanner;

public class Problem05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        double sum=0;
        double high=0;
        int peak=0;
        int count=0;

        for(int i=0;i<n;i++){
            int day =sc.nextInt();
            int roomsOccupied = sc.nextInt();
            int totalRooms = sc.nextInt();
            String Status="";

            double rate=((double)roomsOccupied/totalRooms)*100.0;
            sum+=rate;
            if(rate>high){
                high=rate;
                peak=day;
            }
            if(rate<60){
                Status="Low";
            }
            else if(rate>=60 && rate<80){
                Status="Moderate";
            }
            else if(rate>=80 && rate<100){
                Status="High";
            }
            else if(rate>=100){
                Status="Full";
                count++;
            }
            System.out.println();
            System.out.println("Day: "+day);
            System.out.println("Rooms Occupied: "+roomsOccupied);
            System.out.println("Total Rooms: "+totalRooms);
            System.out.println("Occupancy Rate: "+rate+"%");
            System.out.println("Status: "+Status);
        }
        sc.close();
        double avg = sum/n;
        System.out.println();
        System.out.println("Total Days Analyzed: "+n);
        System.out.println("Average Occupancy Rate: "+String.format("%.2f",avg)+"%");
        System.out.println("Peak Occupancy Day: Day "+peak);
        System.out.println("Days at Full Capacity: "+count);
        sc.close();
    }
    
}
