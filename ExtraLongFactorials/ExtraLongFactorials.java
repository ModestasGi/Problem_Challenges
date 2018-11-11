package hackerrankchallenges.ProblemSolving;

import java.math.BigInteger;
import java.util.Scanner;

public class ExtraLongFactorials {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        extraLongFactorials(n);

        scanner.close();
    }

    // Complete the extraLongFactorials function below.
    private static void extraLongFactorials(int n) {
        BigInteger result = BigInteger.valueOf(1);

            while(n > 0) {
                result = result.multiply(BigInteger.valueOf(n));
                n--;
            }
        System.out.println(result);
    }
}
