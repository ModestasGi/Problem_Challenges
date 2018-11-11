package hackerrankchallenges.ProblemSolving;

import java.util.Scanner;

public class JumpingOnTheCloudsRevisited {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        String[] nk = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nk[0]);

        int k = Integer.parseInt(nk[1]);

        int[] c = new int[n];

        String[] cItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int cItem = Integer.parseInt(cItems[i]);
            c[i] = cItem;
        }

        int result = jumpingOnClouds(c, k);
        System.out.println(result);

        scanner.close();
    }

    // Complete the jumpingOnClouds function below.
    private static int jumpingOnClouds(int[] c, int k) {
        int result = 100;

        for (int i = 0; i < c.length; i += k){
            if(c[i] == 0){
                result -= 1;
                continue;
            }
            if(c[i] == 1){
                result -= 3;
            }
        }
        return result;
    }
}