import java.util.Scanner;
public class Restaurant_Bill_Splitter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int bill=sc.nextInt();
        int service=sc.nextInt();
        int gst=sc.nextInt();
        int person=sc.nextInt();

        int totalService=(bill*service)/100;
        float gstAmount=((bill+totalService)*gst)/100.0f;

        float Bill=(bill+totalService)+gstAmount;
        float equal=Bill/person;
        System.out.println(equal);
        sc.close();
    }

}
