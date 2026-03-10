

import java.util.Scanner;

public class Problem19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int []calories = new int[n];
        int total = 0;
        for(int i=0;i<n;i++){
            calories[i]=sc.nextInt();
            total+=calories[i];
        }
        int target = sc.nextInt();
        double avg = (double) total/n;


        int max = calories[0];
        int maxStore = 1;
        int count = 0;
        for(int i=0;i<n;i++){
            if(calories[i]>max){
                max=calories[i];
                maxStore=i+1;
            }
            if(calories[i]<target){
                count++;
            }
        }
        double goal = (double)(n-count)/n*100;
        System.out.println("Days Tracked: "+n);
        System.out.println("Total Calories Burned: "+total);
        System.out.printf("Average Daily Burn: %.2f\n",avg);
        System.out.printf("Peak Burn: Day %d (%d calories)\n",maxStore,max);
        System.out.println("Days Below Target: "+count);
        System.out.printf("Goal Achievement: %.2f%% units\n",goal);
        sc.close();
    }
}
