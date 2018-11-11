package hackerrankchallenges.ProblemSolving;

import java.util.Scanner;

public class SherlockAndSquares {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int q = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int qItr = 0; qItr < q; qItr++) {
            String[] ab = scanner.nextLine().split(" ");

            int a = Integer.parseInt(ab[0]);

            int b = Integer.parseInt(ab[1]);

            int result = squares(a, b);

            System.out.println(result);
        }
        scanner.close();
    }

    // Complete the squares function below.
    private static int squares(int a, int b) {
        int count = 0;
        int Sqrt = (int) Math.sqrt(b);
        for (int j = 1; j <= Sqrt; j++) {
            if ((j * j) >= a && (j * j) <= b) {
                count++;
            }
        }
        return count;
    }
}
