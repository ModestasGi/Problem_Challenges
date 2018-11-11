package hackerrankchallenges.ProblemSolving;

import java.util.Scanner;

public class UtopianTree {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int t = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int tItr = 0; tItr < t; tItr++) {
            int n = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            int result = utopianTree(n);

            System.out.println(String.valueOf(result));
        }

        scanner.close();
    }

    // Complete the utopianTree function below.
    private static int utopianTree(int n) {
        int result = 1;

        while (n > 0){
            result = result * 2;
            n--;
            if (!(n == 0)){
                result++;
                n--;
            }
        }
        return result;
    }
}
