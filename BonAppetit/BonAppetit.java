package hackerrankchallenges.ProblemSolving;

import java.util.Scanner;

public class BonAppetit {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int totalSum = 0;
        int[] items = new int[n];

        for(int i = 0;i < n;i++){
            items[i] = sc.nextInt();
            totalSum += items[i];
        }

        int annasCharge = sc.nextInt();
        if(k == 0){
            if(totalSum == annasCharge){
                System.out.println("Bon Appetit");
            } else {
                System.out.println("" + (annasCharge - totalSum));
            }
        } else {
            if(annasCharge == (totalSum - items[k]) /2 ){
                System.out.println("Bon Appetit");
            }else{
                System.out.println("" + (annasCharge - (totalSum - items[k])/2));
            }
        }
    }

}
