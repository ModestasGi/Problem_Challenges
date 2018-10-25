package hackerrankchallenges.ProblemSolving;

import java.util.Scanner;

public class CompareTwoListOfNumbers {


    public static void main(String[] arg){

        Scanner in = new Scanner(System.in);

        System.out.println("Here you could compare two lists of numbers. The output result is a score.\n");
        System.out.println("Input how many numbers (in each list of equal quantity of numbers) would you like to compare:");

        int sizeC = in.nextInt();

        System.out.println("\nFirst " + sizeC + " numbers will be compared with the next " + sizeC);
        System.out.println("\nHere will be compared first list: ");

        Scanner op = new Scanner(System.in);

        long[] aList = new long[sizeC];
        long[] bList = new long[sizeC];

        for(int i = 0; i < sizeC; i++){

            aList[i] = op.nextLong();
        }

        System.out.println("with with one:");

        for(int i = 0; i < sizeC; i++){

           bList[i] = op.nextLong();
        }

        int aListScore = 0;
        int bListScore = 0;

        for (int i = 0; i < sizeC; i++) {
            if(aList[i] > bList[i]) {
                aListScore++;
            } else if (bList[i] > aList[i]){
                bListScore++;
            }
        }

        in.close();

        System.out.println("First list score [" + aListScore + "], against [" + bListScore + "] of second list score");

    }

}
