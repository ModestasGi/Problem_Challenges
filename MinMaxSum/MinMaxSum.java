package hackerrankchallenges.ProblemSolving;

import java.util.Scanner;

public class MinMaxSum {

    public static void main(String[] args) {

        Scanner ui = new Scanner(System.in);

        int size = 5;
        // or int size = ui.nextInt(); for desired size to calculate

        long smallest = Long.MAX_VALUE;
        long biggest = 0;
        long rez = 0;
        for(int i=0; i<size; i++) {
            long input = ui.nextLong();
            if(biggest < input) {
                biggest = input;
            }
            if(smallest > input) {
                smallest = input;
            }
            rez += input;
        }
        long minSum = rez - biggest;
        long maxSum = rez - smallest;
        System.out.println(minSum + " " + maxSum);
    }
}
