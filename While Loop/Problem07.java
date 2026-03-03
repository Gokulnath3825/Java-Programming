
import java.util.Scanner;

public class Problem07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        System.out.println("Calculator Menu:");
        System.out.println("1. Add");
        System.out.println("2. Subtract");
        System.out.println("3. Multiply");
        System.out.println("4. Divide");
        System.out.println("5. Exit");
        do {
            choice = sc.nextInt();
            if(choice>=1 && choice<5){
                int a = sc.nextInt();
                int b = sc.nextInt();
                int result;
                System.out.println("Enter two numbers: "+a+" "+b);

                switch(choice){
                    case 1:{
                        result = a + b;
                        System.out.println("Result: "+result);
                        break;
                    }
                    case 2:{
                        result = a - b;
                        System.out.println("Result: "+result);
                        break;
                    }
                    case 3:{
                        result = a * b;
                        System.out.println("Result: "+result);
                        break;
                    }
                    case 4:{
                        if(b!=0){
                            result=a/b;
                            System.out.println("Result: "+result);
                            break;
                        }else{
                            System.out.println("can't Divide by 0");
                        }
                    }
                }
            }
            if(choice==5){
                System.out.println("Goodbye!");
            }


        } while (choice!=5);

        sc.close();
        sc.close();
    }
}
