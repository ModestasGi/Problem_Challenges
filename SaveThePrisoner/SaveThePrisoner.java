package hackerrankchallenges.ProblemSolving;

import java.util.Scanner;

public class SaveThePrisoner {



    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int t = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int tItr = 0; tItr < t; tItr++) {
            String[] nms = scanner.nextLine().split(" ");

            int n = Integer.parseInt(nms[0]);

            int m = Integer.parseInt(nms[1]);

            int s = Integer.parseInt(nms[2]);

            int result = saveThePrisoner(n, m, s);

            System.out.println(result);
        }

        scanner.close();
    }

    // Complete the saveThePrisoner function below.
    private static int saveThePrisoner(int prisoners, int sweets, int startSeat) {
        int warn = ((sweets + startSeat) - 1) % prisoners;
        if(warn == 0) warn = prisoners;
        return warn;
    }
}
