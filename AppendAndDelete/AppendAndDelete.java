package hackerrankchallenges.ProblemSolving;

import java.util.Scanner;

public class AppendAndDelete {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        String s = scanner.nextLine();

        String t = scanner.nextLine();

        int k = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String result = appendAndDelete(s, t, k);

        System.out.println(result);

        scanner.close();
    }

    private static String appendAndDelete(String s, String t, int k) {

        int commonLength = 0;
        for (int i = 0; i < java.lang.Math.min(s.length(), t.length()); i++) {
            if (s.charAt(i) == t.charAt(i)) {
                commonLength++;
            } else {
                break;
            }
        }
        if ((s.length() + t.length() - 2 * commonLength) > k) {
            return "No";
        } else if ((s.length() + t.length() - 2 * commonLength) % 2 == k % 2) {
            return "Yes";
        } else if ((s.length() + t.length() - k) < 0) {
            return "Yes";
        } else
            return "No";

    }
}
