package hackerrankchallenges.ProblemSolving;

import java.util.Scanner;

public class ViralAdvertisingORStage {


    // Complete the viralAdvertising function below.
    private static int viralAdvertising(int n) {
        int people = 2;
        int count  = 2;
        for (int i = 2; i <= n; i++) {
            people = (people * 3) / 2;
            count += people;
        }
        return count;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int result = viralAdvertising(n);

        System.out.println(result);


        scanner.close();
    }

}
