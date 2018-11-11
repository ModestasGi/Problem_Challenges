package hackerrankchallenges.ProblemSolving;

import java.util.Scanner;

public class PermutationOrSequenceEquation {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] p = new int[n];

        String[] pItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int pItem = Integer.parseInt(pItems[i]);
            p[i] = pItem;
        }

        int[] result = permutationEquation(p);

        for (int i = 0; i < result.length; i++) {
            System.out.println(String.valueOf(result[i]));

            if (i != result.length - 1) {
                System.out.println("\n");
            }
        }


        scanner.close();
    }// closing method

    // Complete the permutationEquation function below.
    private static int[] permutationEquation(int[] p) {

        int[] intercept = new int[p.length];
        int[] result = new int[p.length];

// first sorting phase
        for (int i = 1; i <= p.length; i++) {
            int count = 1;
            for (int j = 0; j <= p.length; j++) {
                System.out.println("searching " + i + " position in array p "); // errase after testing, before submitting
                if (i == p[j]) {
                    intercept[i - 1] = count;
                    // by first cycle into 0 index place setting index number of "1" in p array
                    // by second cycle into 1 index place setting index number of "2" in p array
                    // and so on forward
                    System.out.println("print intercept " + (i-1) + " index -> value of " + intercept[i - 1]); // errase after testing, before submitting
                    break;
                }
                count++;
            }
        }
        // errase after testing, before submitting lines 61 to 66
        System.out.println("intercept lenght is " + intercept.length);
        System.out.println("And now print column of intercept array content");
        for (int anIntercept : intercept) {
            System.out.println(anIntercept);
        }
        System.out.println("next stage: ");

// second sorting phase
        for (int y = 0; y < p.length; y++) {
            int count2 = 1;
            for (int aP : p) {
                if (intercept[y] == aP) {
                    result[y] = count2;
                    break;
                }
                count2++;
            }
        }
        return result;
    }// closing method
}// closing class