package hackerrankchallenges.ProblemSolving;

import java.util.Scanner;

public class AVeryBigSum {

    public static void main(String[] agrs){

        Scanner ui = new Scanner(System.in);

        System.out.println("Input the number of how many integers you would like to sum up: ");
// ui.skip("(\r\n|[\n\r\u2028\u2029\u0085])?"); skip irregular symbols
        int n = ui.nextInt();

        System.out.println("\nNow insert the numbers:");

        long sum = 0;

        for (long i = 0; i < n; i++){

            sum += ui.nextLong();

        }

        System.out.println("The sum is: [" + sum + "]");
    }

}
