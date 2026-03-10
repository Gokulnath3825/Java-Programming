import java.util.Scanner;

public class Problem16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long []volume = new long[n];
        int []index = new int[n];
        long total = 0;
        for(int i=0;i<n;i++){
            volume[i]=sc.nextInt();
            total+=volume[i];
        }
        long avg = total/n;
        double avg_150 = avg * 1.50;
        int count=0;
        long max = volume[0];
        int maxStore = 1;
        for(int i=0;i<n;i++){
            if(volume[i]>max){
                max = volume[i];
                maxStore=i+1;
            }
            if(volume[i]>avg_150){
                index[count] = i+1;
                count++;
            }
        }
        System.out.println("Trading Days Analyzed: "+n);
        System.out.println("Total Volume: "+total);
        System.out.println("Average Daily Volume: "+avg);
        System.out.printf("Peak Volume Day: Day %d (%d)\n",maxStore,max);
        System.out.println("High Volume Days (>150% avg):"+count);
        System.out.print("Breakout Signal Days: [");
        for(int i=0;i<count;i++){
            System.out.print(index[i]);
            if(i<count-1){
                System.out.print(", ");
            }
        }
        System.out.println("]");
        sc.close();

    }
}
