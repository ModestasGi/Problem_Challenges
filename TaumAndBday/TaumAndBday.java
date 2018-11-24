package hackerrankchallenges.ProblemSolving;

import java.util.Scanner;

public class TaumAndBday {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int t = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int tItr = 0; tItr < t; tItr++) {
            String[] bw = scanner.nextLine().split(" ");

            int b = Integer.parseInt(bw[0]);

            int w = Integer.parseInt(bw[1]);

            String[] bcWcz = scanner.nextLine().split(" ");

            int bc = Integer.parseInt(bcWcz[0]);

            int wc = Integer.parseInt(bcWcz[1]);

            int z = Integer.parseInt(bcWcz[2]);

            long result = taumBday(b, w, bc, wc, z);

            System.out.println(result);
        }
        scanner.close();
    }

    // Complete the taumBday function below.
    private static long taumBday(int b, int w, int bc, int wc, int z) {
        long minBlack = Math.min(bc, wc + z);
        long minWhite = Math.min(wc, bc + z);

        return (minBlack * b) + (minWhite * w);
    }
}
