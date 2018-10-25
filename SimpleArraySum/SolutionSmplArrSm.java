package hackerrankchallenges.ProblemSolving;

import java.util.Scanner;

public class SolutionSmplArrSm {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int arCount = Integer.parseInt(scanner.nextLine().trim());

        int[] ar = new int[arCount];

        String[] arItems = scanner.nextLine().split(" ");

        for (int arItr = 0; arItr < arCount; arItr++) {
            int arItem = Integer.parseInt(arItems[arItr].trim());
            ar[arItr] = arItem;
        }

        int result = 0;

        for (int arItr = 0; arItr < arCount; arItr++){

            result = result + ar[arItr];
        }

        System.out.println(result);


    }
}