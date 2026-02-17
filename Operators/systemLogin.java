import java.util.Scanner;

public class systemLogin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int name=sc.nextInt();
        int password=sc.nextInt();
        int lock=sc.nextInt();

        if(name==1 && password==1){
            if(lock!=1){
                System.out.println("Success");
            }
            else{
                System.out.println("Failed");
            }
        }
        else{
            System.out.println("Failed");
        }
        sc.close();


    }
    
}
