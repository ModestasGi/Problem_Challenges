package hackerrankchallenges.ProblemSolving;

import java.util.Scanner;

public class CompareTheTriplets {

    public static void main(String[] args) {

        Scanner numberCompare = new Scanner(System.in);
        int a0 = numberCompare.nextInt();
        int a1 = numberCompare.nextInt();
        int a2 = numberCompare.nextInt();
        int b0 = numberCompare.nextInt();
        int b1 = numberCompare.nextInt();
        int b2 = numberCompare.nextInt();

        int alice = ((a0 > b0)?1:0) + ((a1 > b1)?1:0) + ((a2 > b2)?1:0);
        int bob = ((b0 > a0)?1:0) + ((b1 > a1)?1:0) + ((b2 > a2)?1:0);

        System.out.println(alice + " " + bob);
    }
}
